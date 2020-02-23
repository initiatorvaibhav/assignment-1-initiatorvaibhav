package ADT;

public interface ContactADT<E> {
    void add ( E item );

    E remove ( int index );

    int search ( E item );

    void print ();

    E get ( int index );

}
