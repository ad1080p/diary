import java.util.Scanner;

public class Kalender {
    public static void main(String[] args) {
        int month;
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year;
        int startday;
        int monthValue;
        int selection;
        String monthsString[] = {"",
                "January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        boolean isLeap = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your values: year/startday/month");
        year = scanner.nextInt();
        startday = scanner.nextInt();


        for (month =scanner.nextInt(); month <= 12; month++) {

            // check for leap year
            if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && month == 2)
                days[month] = 29;

            System.out.println("          "+ monthsString[month] + " " + year);
            System.out.println("__________________________");
            System.out.println("Su Mo Tu We Th Fr Sa");

            startday = (days[month-1] + startday)%7;
            for (int i = 0; i < startday;i++){
                System.out.print("     ");

            }
            for (int i = 1;i<=days[month];i++){
                System.out.printf("%3d", i);
                if(((i+startday)%7==0)||(i==days[month])) System.out.println();
            }
            System.out.println();
        }
    }
}
