import java.util.Scanner;

public class hacker_man {
    public static void main(String[] args) {
        String passwort = "....";
        String[]nummer2 =Nummer();

        boolean pop = true;
//Je mehr loops ich ein baue, kann ich mehr stellige passwörter knacken

        long startT = System.currentTimeMillis();


        for (int a = 0; a < nummer2.length && pop; a++) {
            for (int b = 0; b < nummer2.length && pop; b++) {
                for (int c = 0; c < nummer2.length && pop; c++) {
                    for (int d = 0; d < nummer2.length && pop; d++) {


                        String passwortversuch = (nummer2[a] + nummer2[b] + nummer2[c] + nummer2[d]);


                        if (passwort.equals(passwortversuch)) {

                            System.out.println("Found: " + passwortversuch);
                            pop = false;


                        } else {

                        }
                    }
                }

            }
        }

        long endT = System.currentTimeMillis();
        System.out.println(endT - startT + "ms");
    }

    /*Random password generator, du gibts ein in die konsole wie viele stellen das passwort haben soll, aber bitte nicht mehr oder weniger als 4
     * Wenn es mehr oder weniger werden sollen, muss ich mehr loops einfügen */


    public static String[] Nummer() {
        String[] nummer1 = {"1","2","3","4","5","6","7","8","9","0",
                "#","@","*","&","§","=","~","^","!","+",";",".",":",",","-","_","<",">","|",
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","w","v","u","x","y","z",
                "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","W","V","U","X","Y","Z"

        };


            return nummer1;
    }

    public static String random_password_generator() {
        System.out.println("Wie viele stellen soll das generierte passwort haben?");
        Scanner input = new Scanner(System.in);
        String[] nummer1 =Nummer();
        String nummer2 = Nummer().toString();
        char[] chararray = nummer2.toCharArray();

        int digit = input.nextInt();

        String password = "";

        for (int i = 0; i < digit; i++) {
            int rand = (int) (3 * Math.random());

            switch (rand) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;

                case 1:
                    rand = (int) (nummer2.length() * Math.random());
                    password += String.valueOf(nummer2.charAt(rand));
                    break;
                case 2:
                    rand = (int) (nummer2.length() * Math.random());
                    password += String.valueOf(nummer2.charAt(rand));
                    break;
                default:
                    password = "0000";
            }
        }
        System.out.println("Generated Password: "+password);

        return password;

    }


}









