

public class singlylinkedlist<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public singlylinkedlist() {

    }
    public boolean isEmpty() {
        return size == 0;

    }
    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addfirst(E e) {

        head = new Node<E>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void addlast(E e) {
        Node<E> newest = new Node<E>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }
    public E Removefirst(){
        if (isEmpty()) return null;
        E x =head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return x;
    }


    public static class Node<E> {
        private E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

//        public void setElement(E element) {
//            this.element = element;
//        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
