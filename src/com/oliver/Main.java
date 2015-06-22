package com.oliver;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.print();

        LinkedListReverser<Integer> llr = new LinkedListReverser<Integer>();
        llr.reverse(ll);
        ll.print();
    }
}
