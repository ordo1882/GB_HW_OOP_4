import java.util.List;

public class Main {
    /*
    * Prints out all objects which are content in the box.
    * @param items a list of Box objects
    */
    static void printBoxContent(List<? extends Box> items) {
        System.out.print("Box content: ");
        for (Box item : items) {
            System.out.print(item.getItem() + ", ");
        }
        System.out.println();
    }
    /*
    * Prints out current fields position in Pair objects
    * @param pairs a list of Pair objects
    */
    static void swapPairs(List<? extends Pair> pairs){
        for (Pair pair : pairs) {
            // Prints out fields position before swapping
            System.out.println("The normal pair: " + pair.getFirst() + ", " + pair.getSecond());
            // calls swap method
            pair.swap(pair);
            // Prints out fields position after swapping
            System.out.println("Swapped pair: " + pair.getFirst() + ", " + pair.getSecond());
        }
    }

    public static void main(String[] args) {
        // Fills the box with different types of items
        List<Box> items = List.of(new Box<>(34), new Box<>("Something"), new Box<>(6.78), new Box<>('W'));
        // Fills pairs list with different types of elements
        List<Pair> pairs = List.of(new Pair<>(7, 'R'), new Pair<>(8.9, "Text"));

        printBoxContent(items);

        swapPairs(pairs);
    }
}