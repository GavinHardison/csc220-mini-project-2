public class Item<T> {

    T data;
    Item<T> next;

    public Item(T data, Item<T> next) {
        this.data = data;
        this.next = next;
    }
}