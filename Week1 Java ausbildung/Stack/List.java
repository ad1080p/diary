package Stack;

public class List {
    public Node head;

    public Node tail;


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

    void push(int newData) {
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
    }


    public int pop() throws StackTooSmallException {
        try {
            System.out.print("Last element to be removed: ");
            System.out.println(tail.data);
            deleteNode(tail);
            tail = tail.previous;

            return tail.data;
        } catch (NullPointerException e) {
            throw new StackTooSmallException("Too few Values to Compute!");
        }
    }

    public int[] popNth(int n) throws StackTooSmallException {
        int[] valuesFromStack = new int[n];
        try {

            System.out.println("The collection of Values to be removed are: ");
            for (int i = 0; i < n; i++) {
                valuesFromStack[i] = tail.data;
                deleteNode(tail);
                tail = tail.previous;

                System.out.print(valuesFromStack[i] + " ");
            }
            System.out.println();

            return valuesFromStack;
        } catch (NullPointerException e) {
            throw new StackTooSmallException("Too few Values to Compute!");
        }
    }

    public int peek() throws StackTooSmallException {
        try {
            System.out.print("The last Element of the Stack is: ");
            System.out.println(tail.data);

            return tail.data;
        } catch (NullPointerException e) {
            throw new StackTooSmallException("Too few Values to Compute!");
        }
    }
}


