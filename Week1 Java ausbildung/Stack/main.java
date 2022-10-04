package Stack;


public class main {
    public static void main(String[] args) throws StackTooSmallException {
        List list = new List();
        List stack = new List();
        stack.add(0);

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(11);
        stack.push(13);

        stack.peek();

        stack.popNth(4);

        stack.pop();

        stack.peek();

        stack.getSize();


    }
}
