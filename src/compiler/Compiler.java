/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;
import GUI.Frame;

/**
 *
 * @author omarf
 */
public class Compiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame frame=new Frame();
        
        frame.setVisible(true);
        Dictionray<String , String> mydic = new Dictionray<>();
        mydic.insert("if","condition");
        System.out.println(mydic.Get_value("if"));
//        String x="omar";
//        
//        System.out.println(x.length());
        
        
        
        
        
    }
    
}
