package Stack;


public class Node {

    int data;
    Node previous;
    Node next;


    public Node(int d) {
        data = d;
        next = null;
        previous = null;
    }

    public Node(int data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;

    }
}
