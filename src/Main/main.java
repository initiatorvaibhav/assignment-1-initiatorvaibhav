package Main;

import LinkedList.MyLinkedList;
import LinkedList.person;

public class main {
    public static void main ( String[] args ) {
        person l1 = new person ( "vaibhav", "pratap", "darW@", "978878" );
        MyLinkedList<person> p1 = new MyLinkedList<> ();
        l1.print ();
        p1.add ( l1 );
        p1.print ();


    }
}
