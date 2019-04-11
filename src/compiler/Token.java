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
public class Token {
    public Pair[] resrverd_words;
    public Token(String word){
        this.resrverd_words[0]=new Pair("if","condition");        
        this.resrverd_words[1]=new Pair("else","condition");        
    }
    public Object Search_For_Key_Word(Character[] word){
        for(int index = 0;index<this.resrverd_words.length;index++){
            Integer Size = this.resrverd_words[index].key.length;
            boolean flag =true;
            for(int itr =0;itr<Size;itr++){
                if(word[itr]!=this.resrverd_words[index].key[itr]){
                    flag =false;
                    break;
                   
                }
            }
            if(flag){
                return this.resrverd_words[index].value; 
            }
        }
        return false;
    }
    
    
    

}
