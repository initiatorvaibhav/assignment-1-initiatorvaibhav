package LinkedList;

import ADT.ContactADT;

public class MyLinkedList<E> implements ContactADT<E> {
    public int size = 0;
    private Node<E> head = null;

    @Override
    public void add ( E item ) {

    }

    @Override
    public E remove ( E item ) {
        return null;
    }

    @Override
    public int search ( E item ) {
        return 0;
    }

    @Override
    public void print () {

    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public E getData () {
            return data;
        }

        public Node<E> getNext () {
            return next;
        }



        private Node ( E data, Node<E> next ) {
            this.data = data;
            this.next = next;
        }

        private Node ( E data ) {
            this.data = data;
        }

    }
}
