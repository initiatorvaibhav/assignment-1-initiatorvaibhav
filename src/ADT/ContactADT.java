package ADT;

public interface ContactADT<E> {
    void add ( E item );

    E remove ( E item );

    int search ( E item );

    void print ();

}
