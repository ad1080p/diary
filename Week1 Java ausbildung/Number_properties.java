import java.util.Scanner;
public class Number_properties {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int luckyNumber = 6;
        System.out.println("The luck number is! "+ luckyNumber);
        System.out.println("Enter your Number!");
        int uN = s.nextInt();//uN = userNumber in actual int


        if (uN%10==0){
            System.out.println("Your number is straight!");
        }
        if (uN%2==0){
            System.out.println("Your number is round!");
        }
        if (uN==luckyNumber){
            System.out.println("Your number is equal to the lucky number!");
        }
        if (uN>9||uN<100){
            System.out.println("Your number has 2 digits!");

        }



    }
}
