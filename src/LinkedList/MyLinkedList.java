package LinkedList;

import ADT.ContactADT;

public class MyLinkedList<E> implements ContactADT<E> {
    public int size = 0;
    private Node<E> head = null;

    public void add ( int index, E item ) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException ( Integer.toString ( index ) );
        } else if (index == 0) {
            addFirst ( item );
        } else {
            Node<E> temp = getNode ( index - 1 );
            addAfter ( temp, item );
        }

    }

    private void addAfter ( Node<E> node, E item ) {
        node.next = new Node<> ( item, node.next );
        size++;
    }

    private Node<E> getNode ( int i ) {
        Node<E> response = head;
        return response;
    }

    private void addFirst ( E item ) {
        head = new Node<> ( item, head );
        size++;
    }

    @Override
    public void add ( E item ) {
        add ( size, item );
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
        System.out.println ( "[" );
        for (int i = 0; i < size; i++) {
            E data = this.getNode ( i ).getData ();
            System.out.println ( data + (i < size - 1 ? "," : "") );
        }
        System.out.println ( "]" );
    }

    @Override
    public E get ( int index ) {
        String data = ";";
        for (int i = 0; i < index + 1; i++) {
            data = (String) this.getNode ( i ).getData ();
        }
        return (E) data;
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
