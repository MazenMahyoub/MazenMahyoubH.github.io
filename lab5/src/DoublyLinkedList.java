public class DoublyLinkedList <E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size =0;

    public DoublyLinkedList()
    {
        header=new Node<E>(null,null,null);
        trailer=new Node<E>(null,header,null);
        header.setNext(trailer);
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size ()
    {
        return size;
    }
    public E First()
    {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }
    public E Last()
    {
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }
    private void addBetween(E e ,Node<E> p,Node<E>m)
    {
        Node<E> newest =new Node<>(e,p,m);
        p.setNext(newest);
        m.setPrev(newest);
        size++;
    }
    public void addFirst(E element)
    {
        addBetween(element,header,header.getNext());
    }
    public void addlast(E element)
    {
        addBetween(element,trailer.getPrev(),trailer);
    }
    private E remove(Node<E> x)
    {
        Node<E> p=x.getPrev();
        Node<E> n=x.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return x.getElement();
    }
    public E removeFirst()
    {  if (isEmpty())return null;
       return remove(header.getNext());
    }
    public E removelast()
    {  if (isEmpty())return null;
        return remove(trailer.getPrev());
    }




    private static class Node<E>{
        E element;
        Node<E> prev;
        Node<E> next;

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
