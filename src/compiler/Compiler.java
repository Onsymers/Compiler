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
        //frame.setVisible(true);
        boolean [] a = new boolean[2];
        compiler_scanner s = new compiler_scanner();
        String test = "Iow ali = 10 # \n Law $omar \n 0ali 1. -> -10 ( ali == 10 ) { print ( ali ) } Else { print ( omar ) } \0";
        String test2 = "1.1 \0";
        char words [] =test.toCharArray();
        char[] x = {'I','o','w'};
        char[] z ={'I','o','w'};
       
       Dictionray<Entry , Integer > tokens=s.Scan(words);
       
        //System.out.println(tokens.Size());
        for(int i =0;i<tokens.Size();i++){
            System.out.print(tokens.EntryAt(i).Value());
            System.out.print(" ");
            System.out.print((char[])(tokens.EntryAt(i).Key().Key()));
            System.out.print(" ");
            System.out.println((char[])tokens.EntryAt(i).Key().Value());
          }  
                
        }
        //System.out.print("Done");
        //System.exit(1);
    //System.out.print(a[0]);
       ///frame.setVisible(true);

        
        
        
  }
    

