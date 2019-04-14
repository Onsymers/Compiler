/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author ali
 * @param <K>
 */
public class Dictionray<K,V> {
    private  Entry <K,V>[] map ;
    public int counter  =0;
    public Dictionray(){
       this.map = new Entry[10000000];
    }


    public Entry<K,V> Get_value(K key){
        if(key instanceof char []){
          //System.out.println(this.counter);
         for(int index =0;index<this.counter;index++){
             char[]item,item2;
             item = (char [])this.map[index].Key();
             item2 = (char[])key;
             boolean flag =true;
             int pointer =0;
             while(item[pointer]!='\0'&&item2[pointer]!='\0'){
                 if(item[pointer]!=item2[pointer]){
                     flag = false;
                     break;
                 }
                 pointer++;
             }
             if(flag==true&&item[pointer]=='\0'&&item2[pointer]=='\0'){
                 return this.map[index];
             }else {
                 char[] err = {'e','r','r','o','r'};
                 Entry error = new Entry(key,err);
                 return null;
             }
             
            }
        }else if(key instanceof Integer ){

             for(int i =0;i<this.counter;i++){
                if(this.map[i].Key().equals(key)){
                    return this.map[i];

                }
            }
        }
       
        return null;
    }
    public Entry<K,V> Get_Pair(K key){
        for(int i =0;i<this.counter;i++){
            if(this.map[i].Key().equals(key)){
                return this.map[i]; 
            }
        }
        return null;
    }
    public void insert(K key, V value){
        Entry<K,V> item = new Entry<K,V>(key,value);
        if(this.counter == 0){
           this.map[0] = item;
           this.counter ++;
        }else {
            this.map[counter]=item;
            this.counter++;
        }
       
        
    }
    public void delete(Entry<K,V> item){
       //lwo a7tgnha 
    }
    public int Size(){
        return this.counter;
    }
    public boolean Empty(){
        return this.Size()==0;
    }
    public Entry<K,V> EntryAt(int index){
        return this.map[index];
    }
}
