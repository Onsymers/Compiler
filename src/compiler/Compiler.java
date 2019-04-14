/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;
import GUI.Frame;
import java.util.Arrays;

/**
 *
 * @author omarf
 */
public class Compiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Frame frame=new Frame();
        boolean [] a = new boolean[2];
        compiler_scanner s = new compiler_scanner();
        String test = "ads";
        char words [] ={'1',' ','2'};
        Dictionray<Entry , Integer > tokens=s.Scan(words);
       // System.out.println(tokens.Size());
        for(int i =0;i<tokens.Size();i++){
            System.out.print(tokens.EntryAt(i).Value());
            System.out.print(" ");
            System.out.print((char[])(tokens.EntryAt(i).Key().Key()));
            System.out.print(" ");
            System.out.println((char[])tokens.EntryAt(i).Key().Value());
            
             
        }
        System.out.print("Done");
        //System.exit(1);
    //System.out.print(a[0]);
       ///frame.setVisible(true);

        
        
        
    }
    
}
