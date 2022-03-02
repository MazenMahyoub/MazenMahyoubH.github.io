package com.company;
/* CREATED BY Mazen Mahyoub */
public class Q1 {
    public int mySize(){
        if(tail == null) return 0;
        int size = 1;
        Node<E> n = tail.getNext();
        while(n != tail){
            n = n.getNext();
            size++;
        }
        return size;
    }
}
