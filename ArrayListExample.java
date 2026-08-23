import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        
        ArrayList<Integer> numbers = new ArrayList<>(number);

        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        int firstItem = numbers.get(0); 
        System.out.println("Item at index 0: " + firstItem);

        System.out.println("Total items: " + numbers.size());

        numbers.set(1, 99);

        numbers.remove(2);

        System.out.println("Remaining items in ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }
    }
}
