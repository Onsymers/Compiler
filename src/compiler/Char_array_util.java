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
        while(arr[i]!='\0'){
            i++;
        }
        return i;
    }
    
    static boolean equals(char [] arr1, char [] arr2){
        
        if(len(arr1)!=len(arr2))
            return false;
        else{
            int i =0;
            while(arr1[i]!='\0'){
                if(arr1[i] != arr2[i])
                    break;
                i++;
            }
            if(i != len(arr1)){
                return false;
            }
            return true;
        }
}
}
