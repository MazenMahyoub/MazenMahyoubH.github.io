package com.company;

public class Q3 {
    public CircuralyLinkedList<E> split(CircuralyLinkedList<E> L){
        CircuralyLinkedList<E> m = new CircuralyLinkedList<E>();
        Node<E> t = L.tail;
        for (int i = 1; i < L.size() / 2; i++) {
            t = t.getNext();
        }
        m.tail = t.getNext();
        t.setNext(L.tail);
        for (int i = 1; i < L.size()/2; i++) {
            t = t.getNext();
        }
        t.setNext(m.tail);
        return m;
    }

}
