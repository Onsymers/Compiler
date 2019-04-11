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
    
    public Dictionray<Character[] , Character[] > resrverd_words;
    private int pointer  =0;
    public compiler_scanner(){
        resrverd_words = new Dictionray<Character[], Character[]>();
    }
    public void Scan_interface(){
        
    }
    public void Scan_file(Character[] words,int Size){
        
    }
    public Entry<Character[],Character[]> Search_For_Key_Word(Character[] word){
        for(int index = 0;index<this.resrverd_words.Size();index++){
               if(this.resrverd_words.Get_value(word)!=null){
                   return this.resrverd_words.Get_Pair(word);
            }
        }
        return null;
    }
    public Entry<Character[],Character[]> Search_In_Transition_Table(Character[] words){
        
    }
   
}
