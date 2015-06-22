package com.oliver;

public class LinkedListReverser<T> {

    public void reverse(LinkedList<T> ll) {

        LinkedListEntry<T> prev = null;
        LinkedListEntry<T> curr = ll.getHead();

        while(curr != null) {
            LinkedListEntry<T> temp = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = temp;
        }

        ll.setHead(prev);
    }
}
