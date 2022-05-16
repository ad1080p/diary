import java.util.Scanner;
public class working_times {
    public static void main(String[] args) {
        int[] timeArray = {8,9,10,11,14,15,16};
        int[] lunchBreak = {12,13};
        boolean stop = true;
        Scanner eye = new Scanner(System.in);

        System.out.println("Enter your hour! ");
        int hour = eye.nextInt();

        for (int a = 0; a<timeArray.length&&stop;a++){
            if (hour==timeArray[a]){
                System.out.println("Entered hour is within the working Times of Codersbay!");
                stop = false;

            }
            else if (hour!=timeArray[a]){
                System.out.println("Entered hour is outside of working Times of Codersbay!");
                stop=false;
            }
        }
        for (int a = 0; a<lunchBreak.length&&stop;a++){
            if (hour==lunchBreak[a]){
                System.out.println("Entered hour is the lunchbreak!");
                stop = false;
            }
        }
    }
}
