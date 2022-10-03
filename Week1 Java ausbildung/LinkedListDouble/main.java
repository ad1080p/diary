package LinkedListDouble;


public class main {
    public static void main(String[] args) {
        List list = new List();

        list.add(5);
        list.add(6);
        list.add(7);

        list.append(3);
        list.push(1);

        list.deleteNode(list.head.next);

        list.printList();

        list.getValueOfList(7);
        list.getSize();

        list.printFromTail();
        list.reverseGetValueOfList(6);

        List listTwo = new List();

        listTwo.add(51);
        listTwo.add(61);
        listTwo.add(71);

        System.out.println("=".repeat(30));
        list.printList();
        System.out.println("=".repeat(30));
        listTwo.printList();
    }
}
