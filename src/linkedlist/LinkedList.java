package linkedlist;

import org.w3c.dom.traversal.NodeIterator;

import java.util.Iterator;

public class LinkedList implements List, Iterable {
    int size;
    Node head;

    public LinkedList() {
        this.head = new Node(0);

    }

    @Override
    public Iterator iterator() {
        return new NodeIterator();
    }

    public class NodeIterator implements Iterator<Node> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Node next() {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.next;
        }
    }

    private class Node {
        int val;
        Node next;


        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }


        public Node(int value) {
            this.val = value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int getIndex(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Invalid index");
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    @Override
    public void add(int value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
        } else {
            Node n1 = head;
            while (n1.next != null) {
                n1 = n1.next;
            }
            n1.next = n;
        }
        size++;
    }


    @Override
    public int add(int index, int value) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Invalid Index");
        Node temp = new Node(value);
        Node current = head;

        for (int i = 0; current != null && i < index; i++) {
            current = current.next;
        }

        temp.next = current.next;
        current.next = temp;

        size++;
        return value;

    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        Node first= head;
        Node x = first;
        if (index == 0) {
            first = first.next;
            size = size - 1;

        }

        for (int i = 1; i < index; i++) {
            x = x.next;
        }
        size = size - 1;
    }

    @Override
    public String toString() {
        String s="";

        for(int i=1;i<=size;i++){
            s=s+getIndex(i)+"-->";
        }
        return s+"null";
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        // l.add(0,12);
        l.add(0, 14);
        l.add(1, 14);
        l.add(2, 25);
        l.add(3,45);
        l.add(4,63);
        //System.out.println(l.getIndex(1));
      //  System.out.println(l.add(2, 15));
       // System.out.println(l.size());
       // System.out.println(l.isEmpty());
       // l.delete(1);
       // System.out.println(l.size());
       // System.out.println(l.getIndex(2));
        System.out.println(l.toString());


    }
}
