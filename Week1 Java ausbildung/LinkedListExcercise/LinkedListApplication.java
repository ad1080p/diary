package LinkedListExcercise;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList revList = new LinkedList();


        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);


        LinkedList.printList(list);
        LinkedList.getSize(list);

        // LinkedList.deleteNode(3, list);

        LinkedList.printList(list);
        LinkedList.getSize(list);
        list.head = LinkedList.reverseList(list.head);
        
        LinkedList.printReverseList(list.head);
        LinkedList.getSpecificValueOfList(list, 2);


    }


}
