public interface BagInterface<T> {

    void display();

    boolean add(T newEntry);

    T remove();

    boolean remove(T anEntry);

    boolean contains(T anEntry);

}