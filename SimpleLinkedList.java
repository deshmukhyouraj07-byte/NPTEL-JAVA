import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleLinkedList<E> {

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    // Constructor 1: Empty list
    public SimpleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Constructor 2: Pre-filled from a collection
    public SimpleLinkedList(Collection<? extends E> c) {
        this();
        for (E element : c) {
            this.add(element);
        }
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void display() {
        Node<E> current = head;
        System.out.print("List: [");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println("] (Size: " + size + ")");
    }

    public static void main(String[] args) {
        System.out.println("--- Empty Constructor ---");
        SimpleLinkedList<String> emptyList = new SimpleLinkedList<>();
        emptyList.display(); 
        
        System.out.println("\n--- Collection Constructor ---");
        List<String> starterPack = new ArrayList<>();
        starterPack.add("Apple");
        starterPack.add("Banana");
        starterPack.add("Cherry");

        SimpleLinkedList<String> populatedList = new SimpleLinkedList<>(starterPack);
        populatedList.display();
    }
}
