package structures;

import java.util.Iterator;

public class OrderedList <T extends Comparable<T>> implements OrderedSequence<T>, Iterable{

    private Node<T> head;

    @Override
    public NodeI iterator() {
        return new NodeI(this);
    }
    public class NodeI implements Iterator{
        Node n;
        Node prevN;
        OrderedList ol;

        public NodeI(OrderedList ol){
            this.ol = ol;
            this.n = head;
            this.prevN = n;
        }

        @Override
        public boolean hasNext() {
            return n != null;
        }

        @Override
        public Node next() {
            prevN = n;
            this.n = n.getNext();
            return prevN;
        }

        @Override
        public void remove() {
            ol.remove(prevN.getData());
        }
    }
    public class Node <T extends Comparable<T>>
    {
        private Node<T> next;
        private T data;
        public T getData(){ return this.data;}
        public Node<T> getNext() { return next; }
        public void setNext(Node<T> next) { this.next = next; }

        public Node(T d){
            if(d == null)
                throw new NullPointerException("Constructor is provided with null data.");
            this.data = d;
            this.setNext(null);
        }
        @Override
        public boolean equals(Object obj) {
            return this.data.equals(((Node) obj).data);
        }

        @Override
        public String toString() {
            return "{ " + data + " }";
        }
    }

    @Override
    public void insert(T t) {
        Node newN = new Node(t);

        //If 0th element is empty - insert
        if(this.head == null){
            this.head = newN;
            return;
        }

        //Check whether the head substitution is needed.
        if(head.getData().compareTo(t) > 0){
           newN.setNext(this.head);
           this.head = newN;
           return;
        }

        Node n = head;

        //Otherwise the element will be inserted at the (k+1)th index.
        while(n.getNext() != null){
            checkDuplicate(n.getNext(), newN);
            //if (k+1)th element's data is less than t - iterate.
            if(n.getNext().getData().compareTo(t) < 0)
                n = n.getNext();
            else{
                newN.setNext(n.getNext());
                n.setNext(newN);
                return;
            }
        }

        //if isInserted stays false it means that we checked all the elements,
        // but everyone's data is less than t. n is the last Node.
        n.setNext(newN);

    }

    @Override
    public void remove(T t) {
        if(head == null)
            return;
        //Check head (0th element of the list)
        if (head.getData().compareTo(t) == 0){
            this.head = head.getNext();
            return;
        }

        Node n = head;
        //Loop checks (k+1)th element
        while(n.getNext() != null){
            if(n.getNext().getData().compareTo(t) == 0){
                n.setNext(n.getNext().getNext());
                return;
            }
            //Terminates the method if such element won't be found
            if(n.getNext().getData().compareTo(t) > 0)
                return;
            n = n.getNext();
        }
    }

    @Override
    public T min() {
        if(head == null){
            System.out.println("The list is empty. ");
            return (T) null;
        }
        return (T) head.getData();
    }

    @Override
    public T max() {
        if(head == null){
            System.out.println("The list is empty. ");
            return (T) null;
        }
        Node n = head;
        while (n.getNext() != null)
            n = n.getNext();

        return (T) n.getData();
    }

    @Override
    public T at(int i) {
        int num = i+1;
        Node n = head;
        while(n != null && n.getNext() != null && i > 0){
            n = n.getNext();
            i--;
        }
        if(i == 0)
            return (T) n.getData();
        else
            throw new IndexOutOfBoundsException("The list doesn't contain " + num + " elements.");
    }

    @Override
    public boolean search(T t) {
        if(this.index(t) != -1)
            return true;
        return false;
    }

    @Override
    public int index(T t) {
        int i = -1;
        if(head != null){
            Node n = head;
            while( n != null){
                i++;
                if(n.getData().equals(t))
                    return i;
                n = n.getNext();
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        String s = "Ordered List [";
        if(head != null){
            Node n = head;
            while(n != null){
                s = s + " ( " + n.getData().toString() + " ) ";
                n = n.getNext();
            }
        }
        return s + " ]";

    }
    private void checkDuplicate(Node n1, Node n2){
        if(n1.getData().compareTo(n2.getData()) == 0)
                    throw new IllegalArgumentException("This value is already on the list " + n1.getData().toString());
    }
}
