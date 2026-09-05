class LL {

    Node head;
    int size;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

            System.out.println("Node created: " + data);
        }
    }

    // Constructor
    LL() {
        head = null;
        size = 0;

        System.out.println("Linked List created");
        System.out.println("Initially: head = null");
    }

    // Insert at beginning
    public void addFirst(int data) {

        Node newNode = new Node(data);

        // New node points to current head
        newNode.next = head;

        // Head points to new node
        head = newNode;

        size++;

        System.out.println("Inserted " + data + " at beginning");
    }

    // Insert at middle/index
    public void addMiddle(int data, int index) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        // If index is 0, insert at beginning
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);

        Node currNode = head;

        // Move to node before required position
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.next;
        }

        // Connect new node
        newNode.next = currNode.next;
        currNode.next = newNode;

        size++;

        System.out.println("Inserted " + data +
                           " at index " + index);
    }

    // Insert at end
    public void addLast(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            size++;

            System.out.println("Inserted " + data +
                               " as first node");
            return;
        }

        Node currNode = head;

        // Move to last node
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // Last node points to new node
        currNode.next = newNode;

        size++;

        System.out.println("Inserted " + data + " at end");
    }

    // Delete from beginning
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Deleting: " + head.data);

        head = head.next;

        size--;
    }

    // Delete from middle/index
    public void deleteMiddle(int index) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            deleteFirst();
            return;
        }

        Node currNode = head;

        // Move to node before target
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.next;
        }

        System.out.println("Deleting: " + currNode.next.data);

        // Skip the node
        currNode.next = currNode.next.next;

        size--;
    }

    // Delete from end
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            System.out.println("Deleting: " + head.data);
            head = null;
            size--;
            return;
        }

        Node currNode = head;

        // Move to second-last node
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }

        System.out.println("Deleting: " + currNode.next.data);

        currNode.next = null;

        size--;
    }

    // Display linked list
    public void printList() {

        Node currNode = head;

        System.out.print("HEAD -> ");

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");

        System.out.println("Size = " + size);
        System.out.println();
    }

    public static void main(String[] args) {

        LL list = new LL();

        System.out.println("\n1. INITIAL STATE");
        list.printList();

        System.out.println("2. INSERTION AT BEGINNING");

        list.addFirst(10);
        list.printList();

        list.addFirst(20);
        list.printList();

        System.out.println("3. INSERTION IN MIDDLE");

        list.addMiddle(15, 1);
        list.printList();

        System.out.println("4. INSERTION AT END");

        list.addLast(30);
        list.printList();

        System.out.println("5. DEFAULT addLast()");

        list.addLast(40);
        list.printList();

        list.addLast(50);
        list.printList();
      
        System.out.println("6. DELETION FROM MIDDLE");

        list.deleteMiddle(2);
        list.printList();


      System.out.println("7. DELETION FROM BEGINNING");

        list.deleteFirst();
        list.printList();
        System.out.println("8. DELETION FROM END");

        list.deleteLast();
        list.printList();
    }
}