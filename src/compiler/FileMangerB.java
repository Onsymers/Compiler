/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

/**
 *
 * @author ali
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FileMangerB implements Serializable{
    
    public boolean write(String FilePath, Object data) {

        try {
           

            ObjectOutputStream writter = new ObjectOutputStream(new FileOutputStream(FilePath));
              System.out.print("\nwritting in ! " + FilePath);
            writter.writeObject(data);
            System.out.println(" ... Done ! ");
            writter.close();
            return true;

    } catch (IOException e) {
        System.out.println("Can't write ...!\n" + e);
    }

        return false;
    }

    public Object read(String FilePath) {

        Object Result = null;

        try {
             ObjectInputStream Reader = new ObjectInputStream(new FileInputStream(FilePath));
           
             System.out.println("Reading ! From " + FilePath);

           

            Result = Reader.readObject();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileMangerB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Result;

    }

}




