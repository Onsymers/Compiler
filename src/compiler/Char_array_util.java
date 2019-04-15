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
public class Char_array_util {
    static int len(char [] arr){
        int i = 0;
        for(char x : arr){
            i++;
        }
        return i;
    }
    
    static boolean equals(char [] arr1, char [] arr2){
        //System.err.println(len(arr1));
        if(len(arr1)!=len(arr2))
            return false;
        else{
            int i =0;
            for(char y: arr1){
                if(y!=arr2[i]){
                    return false;
                }
                i++;
            }
            
//            while(arr1[i]!='\0'){
//                if(arr1[i] != arr2[i])
//                    break;
//                i++;
//            }
  
            return true;
        }
        
}
       static char [] make_token(char []token ,int size){
           char [] token_real = new char[size];
           for(int i=0;i<size;i++){
               token_real[i] = token[i];
           }
           return token_real;
       }
}
