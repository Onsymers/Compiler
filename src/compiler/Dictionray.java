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
    private int counter  =0;
    public Dictionray(){
       this.map = new Entry[100000];
    }
    public V Get(K key){
        for(int i =0;i<this.counter;i++){
            if(this.map[i].Key()==key){
                return this.map[i].Value(); 
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
    public Integer Size(){
        return this.counter;
    }
    public boolean Empty(){
        return this.Size()==0;
    }
}
