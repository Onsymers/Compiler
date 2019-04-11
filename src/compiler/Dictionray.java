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
    private List< Entry<K,V> > map;
    public Dictionray(){
        this.map = new LinkedList< Entry<K,V> >();
    }
    public V Get(K key){
        for(int i =0;i<this.map.size();i++){
            if(this.map.get(i).Key()==key){
                return this.map.get(i).Value(); 
            }
        
    }
        return null;
    }
    public void insert(K key, V value){
        Entry<K,V> item = new Entry<K,V>(key,value);
        this.map.add(item);
        
    }
    public void delete(Entry<K,V> item){
        this.map.remove(item);
    }
    public Integer Size(){
        return this.map.size();
    }
    public boolean Empty(){
        return this.Size()==0 ;
    }
}
