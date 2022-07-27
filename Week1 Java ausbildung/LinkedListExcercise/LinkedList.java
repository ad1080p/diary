package LinkedListExcercise;

public class LinkedList {


    public static Node head;
    public Node tail;

    public static LinkedList insert(LinkedList list, int data) {

        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void deleteNode(int key, LinkedList list) {
        Node temporaryStorage = list.head, prev = null;
        if (temporaryStorage != null && temporaryStorage.data == key) {
            list.head = temporaryStorage.next;
            return;
        }
        while (temporaryStorage != null && temporaryStorage.data != key) {
            prev = temporaryStorage;
            temporaryStorage = temporaryStorage.next;
        }
        if (temporaryStorage == null) {
            return;
        }
        prev.next = temporaryStorage.next;
    }

    public static int getSize(LinkedList list) {
        int count = 0;
        Node countNodes = list.head;
        while (countNodes != null) {
            count++;
            countNodes = countNodes.next;
        }
        System.out.println();
        System.out.print("Size of List is: ");
        System.out.println(count);
        return count;
    }

    public static void printList(LinkedList list) {
        Node currentNode = list.head;


        System.out.print("LinkedList: ");

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;

        }

    }

    public static void getSpecificValueOfList(LinkedList list, int key) {
        Node currentNode = list.head;
        int count = 0;
        while (currentNode != null) {
            count++;

            if (count == key) {
                System.out.println("Your wished Value is: ");
                System.out.println(currentNode.data);

            }
            currentNode = currentNode.next;

        }

    }

    //____________________________________________________________EXTENSION OF SIMPLE LINKED LIST__________________________________________________________________________
    static Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void printReverseList(Node node) {
        System.out.println("List Reversed: ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }


}
