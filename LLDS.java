import java.util.Arrays;

class LLDS {
    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            return;
        }

N        Node lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    // Add multiple elements
    public void addAll(int... values) {
        for (int value : values) {
            addLast(value);
        }
    }

    // Print Linked List
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // Search for an element
    public int search(int value) {
        Node currNode = head;
        int index = 0;

        while (currNode != null) {
            if (currNode.data == value) {
                return index;
            }

            currNode = currNode.next;
            index++;
        }

        return -1;
    }

    public static void main(String args[]) {

        LL list = new LL();

        // Add all elements in one line
        list.addAll(1, 2, 3, 4, 5, 6, 7);

        // Print list
        list.printList();

        // Search for 7
        int index = list.search(7);

        System.out.println("Index of 7: " + index);
    }
}