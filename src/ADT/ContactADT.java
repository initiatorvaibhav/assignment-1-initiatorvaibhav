package ADT;

public interface ContactADT<E> {
    void add ( E item );

    E remove ();

    int search ( E item );

    void print ();

    E get ( int index );

}
