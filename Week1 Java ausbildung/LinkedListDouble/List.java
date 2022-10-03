package LinkedListDouble;

public class List {
    public Node head;

    public Node tail;

    public int size = 0;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = this.tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        newNode.previous = null;

        if (newNode != null) {
            head.previous = newNode;
        }
        head = newNode;
    }

    void append(int newData) {
        Node newNode = new Node(newData);
        Node last = head;
        newNode.next = null;
        tail = newNode;

        if (head == null) {
            newNode.previous = null;
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.previous = last;
    }

    public void deleteNode(Node del) {
        if (head == null || del == null) {
            return;
        }
        if (head == del) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.previous = del.previous;
        }
        if (del.previous != null) {
            del.previous.next = del.next;
        }
        return;

    }

    public void getValueOfList(int key) {
        Node currentNode = this.head;
        while (currentNode != null) {

            if (currentNode.data == key) {
                System.out.println("Your wished Value is: ");
                System.out.println(currentNode.data);

            }
            currentNode = currentNode.next;

        }

    }


    public int getSize() {

        int count = 0;
        Node countNodes = this.head;
        while (countNodes != null) {
            count++;
            countNodes = countNodes.next;
        }
        System.out.println();
        System.out.print("Size of List is: ");
        System.out.println(count);
        return count;
    }

    public void printList() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }

    }

    public void reverseGetValueOfList(int key) {
        Node currentNode = tail;
        while (currentNode != null) {
            if (currentNode.data == key) {
                System.out.println("Your wished Value is: ");
                System.out.println(currentNode.data);
            }
            currentNode = currentNode.previous;
        }
    }

    public void printFromTail() {

        Node curr = this.tail;

        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.previous;
        }


    /*public static void reverseGetValueOfList(LinkedList list, int key) {
        head = reverse(head);
        Node currentNode = list.head;
        int count = 0;
        while (currentNode != null) {

            if (currentNode.data == key) {
                System.out.println("Your wished Value is: ");
                System.out.println(currentNode.data);

            }
            currentNode = currentNode.next;

        }

    }*/

        /*System.out.println(curr.data);
        curr = curr.previous;
        System.out.println(curr.data);
        curr = curr.previous;
        System.out.println(curr.data);
        */
    }

    /*public void reversePrintList(LinkedList list) {
        head = reverse(head);
        Node currentNode = list.head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    static Node reverse(Node node) {
        if (head == null) return head;
        Node previous = null;
        Node currentNode = node;
        Node next = null;
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
        }
        node = previous;
        return node;
    } */

}
