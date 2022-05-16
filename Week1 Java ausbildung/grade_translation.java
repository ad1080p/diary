import java.util.Scanner;
public class grade_translation {
    public static void main(String[] args) {

        Scanner eye = new Scanner(System.in);
        System.out.println("1 to 5 are viable inputs, whereas 1 is the best and 5 is the worst!");
        System.out.println("Enter your grade as a number!");
        int userGrade = eye.nextInt();

        switch (userGrade){

            case 1:
                System.out.println("Grade is very good!");
                break;
            case 2:
                System.out.println("Grade is good!");
                break;
            case 3:
                System.out.println("Grade is satisfactory!");
                break;
            case 4:
                System.out.println("Grade is sufficient!");
                break;
            case 5:
                System.out.println("Grade is not sufficient!");
                break;
            default:
                System.out.println("Entered Value is invalid!");
        }






    }
}
