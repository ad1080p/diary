import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class libraryEnglishAndGerman {

    static HashMap<String, String> Deutsch = new HashMap<>();
    static HashMap<String, String> Englisku = new HashMap<>();

    public static void main(String[] args) {
        int cycles = 0;
        Scanner eye = new Scanner(System.in);
        Scanner eye2 = new Scanner(System.in);
        boolean doIt = true;
        String inputG;
        String inputE;

        System.out.println("Choose your function: \n" +
                "1: Add a word. \n" +
                "2: Remove a word. \n" +
                "3: Translate. \n" +
                "4: Buy a Child soldier from Uganda! \n" +
                "0: Kill Function selection!");


        int functionSelection;
        do {

            cycles++;
            if (cycles > 1) {
                System.out.println("Another function you want to select?");
            }
            functionSelection = eye.nextInt();

            switch (functionSelection) {
                case 0:
                    doIt = false;
                    break;

                case 1:
                    System.out.println("Please enter german first!");
                    inputG = eye.next();
                    System.out.println("Now english!");
                    inputE = eye.next();

                    addWordToMap(inputG, inputE);

                    break;
                case 2:
                    removeWord(eye);
                    break;

                case 3:

                    System.out.println(Deutsch);
                    System.out.println(Englisku);

                    break;
                case 4:
                    System.out.println("The Authorities have been contacted!");
                    System.out.println("This is Human trafficking! Be ashamed of yourself!");
                    break;
                default:
                    System.out.println("Not good!");
                    continue;
            }
        } while (doIt);
    }

    public static void removeWord (Scanner eye){
        System.out.println("Choose wether you want to remove entries using English or German!\n" +
                "1: German \n" +
                "2: English");
        int functionSelection = eye.nextInt();
        switch (functionSelection) {

            case 1:
                System.out.println("Remove with German");
                String inputG = eye.next();
                removeWordFromMapGer(inputG);
                break;

            case 2:
                System.out.println("Remove with English");
                String inputE = eye.next();
                removeWordFromMapEn(inputE);
                break;
            default:
                System.out.println("dont be dumb :c");
        }
    }

    public static void addWordToMap(String inputG, String inputE) {

        Deutsch.put(inputG, inputE);
        Englisku.put(inputE, inputG);
        System.out.println(Deutsch.get(inputG));

    }
    public static void removeWordFromMapGer(String inputG){
        Englisku.remove(Deutsch.get(inputG));
        Deutsch.remove(inputG);
    }

    public static void removeWordFromMapEn(String inputE){
        Deutsch.remove(Englisku.get(inputE));
        Englisku.remove(inputE);
}}
