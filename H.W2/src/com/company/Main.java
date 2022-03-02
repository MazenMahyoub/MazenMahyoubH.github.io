package com.company;

import static java.lang.Math.E;

public class Main {

    public static void main(String[] args) {
	/* created by Mazen Mahyoub */
        public E FindSecond_to_Nod(Node<E> n){
            Node<E> t = n;
            if (t == null || t.getNext() == null)
                return null;
            while (t.getNext().getNext() != null){
                t = t.getNext();
            }
            return t.getElement();
    }
}
}
