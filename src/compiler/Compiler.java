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
        frame.setVisible(true);
        Dictionray<String , String> mydic = new Dictionray<>();
        Dictionray<Integer,Entry> tokens = new Dictionray<>();
        Entry<char [],char []>item = new Entry<>();
        char ahmed [] ={'a','l','i','\0'};
        char ali [] ={'a','l','y','\0'};
        item.set_key(ali);
        item.set_value(ahmed);
        tokens.insert(1,item);
        Object x = tokens.Get_value(1).Key();
        Object y = tokens.Get_value(1).Value();
        
        //// GUI TEST
        System.out.println("GUI:");
        Dictionray<char[] , char[]> mydict = new Dictionray<>();
        FileManger file = new FileManger();
        mydict = file.read("Tokens.txt");
        char[] hi = {'i','f'};
        
        System.out.println("Token name for: " +Arrays.toString(hi) +" is \n"+Arrays.toString(mydict.Get_value(hi)));
        
//        mydic.insert("if","condition");
//        //System.out.println(mydic.Get_value("if"));
//        System.out.print("ali\n");
//        String x="omar";
//        
//        System.out.println(x.length());
        
        
        
        
        
    }
    
}
