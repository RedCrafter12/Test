package net.suchsel.lib;

import java.util.List;

public interface Field<E> extends List<E> {
    default boolean add(E e){
        add(-1,-1,e);
        return true;
    }
    
    default void add(int index,E e){
        add(index,-1,e);
    }
    
    void add(int index,int element,E e);
    
}