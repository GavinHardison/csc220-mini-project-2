//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //create bag
        UniqueBag<String> bag = new UniqueBag<>();

        //test adding multiple elements
        System.out.println("Adding elements");
        bag.add("A");
        bag.add("B");
        bag.add("C");
        bag.display();

        //try to add dupes
        System.out.println("Trying to add duplicate elements");
        bag.add("A");
        bag.add("B");
        bag.display();

        //test removing elements
        System.out.println("removing elements");
        bag.remove("A");
        bag.remove("B");
        bag.display();

        //test try to remove non-existing elements
        System.out.println("Removing non-existing elements");
        bag.remove("B");
        bag.display();

        //test remove from empty bag
        bag.remove("C");
        System.out.println("Removing from empty bag");
        bag.remove("B");
        bag.display();

        //test adding multiple elements and verifying uniqueness
        System.out.println("adding multiple elements");
        bag.add("A");
        bag.add("B");
        bag.add("C");
        bag.add("A");
        bag.display();

    }
}