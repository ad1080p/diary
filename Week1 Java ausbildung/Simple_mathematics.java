public class Simple_mathematics {
    public static void main(String[] args) {
        int a = 40;
        int b = 20;
        double c = 2.42;
        double d = 5.35;

        int sum = a+b;
        int difference = a-b;
        int divided = a/b;
        int product = a*b;

        double sum2 = c+d;
        double difference2 = c-d;
        double divided2= c/d;
        double product2= c*d;

        System.out.println("The sum of a and b is: "+sum);
        System.out.println("The difference of a and b is: "+ difference);
        System.out.println("a and b devided equal to: "+ divided);
        System.out.println("The product of a and b is: "+ product);
        System.out.println();
        System.out.println("The sum of c and d is: "+String.format("%1.2f", sum2));
        System.out.println("The difference of c and d is  : "+String.format("%1.2f", difference2));
        System.out.println("c and d devided equal to: "+ String.format("%1.2f", divided2));
        System.out.println("The product of c and d is: "+String.format("%1.2f", product2));

    }
}
