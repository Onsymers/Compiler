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
import java.util.*;
public class compiler_scanner{
    
    public Dictionray<char[] , char[] > resrverd_words;
    public Dictionray<Entry , Integer > tokens;
    private int pointer  =0;
    private int Number_Of_Errors =0;
    private int number_of_line =1;
    public compiler_scanner(){
        resrverd_words = new Dictionray<>();
    }
    public void Scan_interface(char[] words){
        char token [] = new char[10000];
        
        while(words[pointer]!='\0'){
         if(words[pointer]!=' '&&words[pointer]!='#'&&words[pointer]!='\t'&&words[pointer]!='\n'){
                token[pointer]=words[pointer];
            
        }else{
                
             if(Search_For_Key_Word(token)==null){
                    
                }else{
                    
                }
   
            }
            
        }
    }
    public void Scan_file(char[] words){
        
    }
    public Entry<char[],char[]> Search_For_Key_Word(char[] word){
        for(int index = 0;index<this.resrverd_words.Size();index++){
               if(this.resrverd_words.Get_value(word)!=null){
                   return this.resrverd_words.Get_Pair(word);
            }
        }
        return null;
    }
    public Entry<char[],char[]> Search_In_Transition_Table(char[] words){
      return null;  
    }
   
}
