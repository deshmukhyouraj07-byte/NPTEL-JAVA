import java.util.Vector;
import java.util.Enumeration;

public class Vectorclass {
    public static void main(String[] args) {
        // Create a Vector of Strings with an initial capacity of 5
        Vector<String> items = new Vector<>(5);

        // 1. int capacity()
        System.out.println("1. Initial Capacity: " + items.capacity()); // Output: 5

        // Let's add some initial elements to work with
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Banana"); // Adding a duplicate to test index methods later

        // 2. boolean contains(Object element)
        System.out.println("2. Contains 'Banana'? " + items.contains("Banana")); // Output: true
        System.out.println("   Contains 'Mango'? " + items.contains("Mango"));   // Output: false

        // 3. E elementAt(int index)
        System.out.println("3. Element at index 2: " + items.elementAt(2)); // Output: Cherry

        // 4. Enumeration<E> elements()
        System.out.print("4. Elements via Enumeration: ");
        Enumeration<String> en = items.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println(); // Output: Apple Banana Cherry Banana 

        // 5. void ensureCapacity(int size)
        items.ensureCapacity(20);
        System.out.println("5. Capacity after ensureCapacity(20): " + items.capacity()); // Output: 20

        // 6. E firstElement()
        System.out.println("6. First element: " + items.firstElement()); // Output: Apple

        // 7. int indexOf(Object element)
        System.out.println("7. First index of 'Banana': " + items.indexOf("Banana")); // Output: 1
        System.out.println("   First index of 'Mango': " + items.indexOf("Mango"));   // Output: -1

        // 8. int indexOf(Object element, int start)
        // Starts searching at or after index 2
        System.out.println("8. Index of 'Banana' starting from index 2: " + items.indexOf("Banana", 2)); // Output: 3

        // 9. boolean isEmpty()
        System.out.println("9. Is the Vector empty? " + items.isEmpty()); // Output: false

        // 10. E lastElement()
        System.out.println("10. Last element: " + items.lastElement()); // Output: Banana

        // 11. int lastIndexOf(Object element)
        System.out.println("11. Last index of 'Banana': " + items.lastIndexOf("Banana")); // Output: 3

        // 12. int lastIndexOf(Object element, int start)
        // Searches backward starting from index 2 (looks at index 2, 1, 0)
        System.out.println("12. Last index of 'Banana' searching backward from index 2: " + items.lastIndexOf("Banana", 2)); // Output: 1

        // 13. void setElementAt(E element, int index)
        items.setElementAt("Blueberry", 1); // Replaces 'Banana' at index 1 with 'Blueberry'
        System.out.println("13. Vector after setElementAt at index 1: " + items); // Output: [Apple, Blueberry, Cherry, Banana]

        // 14. int size()
        System.out.println("14. Total elements (size): " + items.size()); // Output: 4
    }
}
                                                                                         