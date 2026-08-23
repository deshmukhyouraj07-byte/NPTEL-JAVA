import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 1. ADDING ELEMENTS AT THE END
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana");

        // 2. INSERTING AN ELEMENT AT A SPECIFIC SPOT (INDEX 1)
        list.add(1, "Mango");

        // 3. COMBINING ANOTHER LIST TO THE END
        ArrayList<String> extraFruits = new ArrayList<>();
        extraFruits.add("Grapes");
        extraFruits.add("Papaya");
        list.addAll(extraFruits);

        // 4. INSERTING MULTIPLE ELEMENTS AT A SPECIFIC SPOT (INDEX 2)
        list.addAll(2, Arrays.asList("Kiwi", "Cherry"));

        // 5. VIEWING THE CURRENT CONTENT, SIZE, AND EMPTY STATUS
        System.out.println("Initial List: " + list);
        System.out.println("Size of List: " + list.size());
        System.out.println("Is List Empty? " + list.isEmpty());

        // 6. SEARCHING AND LOOKING UP ELEMENTS
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("First index of Banana: " + list.indexOf("Banana"));
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));
        System.out.println("Contains Orange? " + list.contains("Orange"));

        // 7. UPDATING/REPLACING AN ELEMENT AT A SPECIFIC SPOT
        String oldVal = list.set(4, "Blueberry");
        System.out.println("Replaced value: " + oldVal);

        // 8. REMOVING BY POSITION AND REMOVING BY VALUE
        list.remove(2);
        list.remove("Orange");

        // 9. REMOVING BASED ON A SPECIFIC FILTER RULE (PREDICATE)
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("B");
            }
        });

        System.out.println("After removals: " + list);

        // 10. SORTING THE LIST IN ALPHABETICAL ORDER
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 11. CONVERTING THE ARRAYLIST INTO A PLAIN NORMAL JAVA ARRAY
        Object[] normalArray = list.toArray();
        System.out.println("Array Conversion: " + Arrays.toString(normalArray));

        // 12. WIPING OUT EVERYTHING AND RESETTING THE LIST
        list.clear();
        System.out.println("Final size after clear: " + list.size());
    }
}
