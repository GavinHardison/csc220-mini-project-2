public class UniqueBag<T> implements BagInterface<T> {

    private int numberOfEntries;
    private Item<T> firstItem;

    public UniqueBag() {
        this.numberOfEntries = 0;
        this.firstItem = null;
    }

    public void display() {
        Item<T> current = this.firstItem;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    @Override
    public boolean add(T newEntry) {
        if (newEntry == null) {
            return false;
        }

        Item<T> current = this.firstItem;

        while (current != null) {
            if (current.data.equals(newEntry)) {
                return false;
            }

            current = current.next;
        }

        Item<T> addedItem = new Item<>(newEntry, null);

        addedItem.next = firstItem;
        this.firstItem = addedItem;
        this.numberOfEntries++;

        return true;
    }

    @Override
    public T remove() {
        if (this.numberOfEntries == 0) {
            return null;
        }

        T result = this.firstItem.data;
        firstItem = firstItem.next;
        this.numberOfEntries--;
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
        if (anEntry == null) {
            return false;
        }

        Item<T> temp = firstItem, prev = null;

        if (temp != null && temp.data.equals(anEntry)) {
            firstItem = temp.next;
            this.numberOfEntries--;
            return true;
        }

        while (temp != null && !temp.data.equals(anEntry)) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return false;
        }

        prev.next = temp.next;
        this.numberOfEntries--;
        return true;
    }

    @Override
    public boolean contains(T anEntry) {
        if (anEntry == null) {
            return false;
        }

        Item<T> current = this.firstItem;

        while (current != null) {
            if (current.data.equals(anEntry)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }
}