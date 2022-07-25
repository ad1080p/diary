package PersonalManagment;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFunc {
    static ArrayList<String> personArrList = new ArrayList<>();


    public static void main(String[] args) {
        Scanner eye = new Scanner(System.in);
        int selectFunc;
        int count = 0;
        System.out.println("You can select the function by Typing the corresponding number!\n" +
                "0: Exit Selection\n" +
                "1: Add Person \n" +
                "2: Remove person");
        boolean isRunning = true;
        do {
            count++;
            if (count > 1) {
                System.out.println("Please select another function!");
            }


            selectFunc = eye.nextInt();

            switch (selectFunc) {
                case 0:
                    System.out.println("Goodbye!");
                    isRunning = false;
                    break;
                case 1:
                    addPersonSelection(selectFunc, eye);
                    break;
                case 2:
                    removePerson(eye);
                    break;
                default:
                    System.out.println("Please try to type a valid Number!");
                    continue;

            }

        } while (isRunning);
    }

    public static void addPersonSelection(int selectFunc, Scanner eye) {
        System.out.println("Here you can select what Kind of data you want to add to the Person you are adding!\n" +
                "0: Exit Selection Process\n" +
                "1: Add with all Data\n" +
                "2: Add with only name \n" +
                "3: Add name, sex and address");
        boolean isRunning = true;
        int count = 0;
        do {
            count++;
            if (count > 1) {
                System.out.println("Please select another function!");
            }
            selectFunc = eye.nextInt();
            switch (selectFunc) {
                case 0:
                    System.out.println("See you soon!");
                    isRunning = false;
                    break;
                case 1:
                    addPersonAll(eye);
                    break;
                case 2:
                    addPersonName(eye);
                    break;
                case 3:
                    addPersonNameSexAndBirthDate(eye);
                    break;
                default:
                    System.out.println("Please try to input a valid Number!");
                    break;
            }
        } while (isRunning);
    }

    public static PersonAsObject addPersonAll(Scanner eye) {
        
        PersonAsObject personOBJ = new PersonAsObject();
        System.out.println("Please enter First name");
        personOBJ.setpFirstName(eye.next());
        System.out.println("Please enter Last name");
        personOBJ.setpLastName(eye.next());
        System.out.println("Please enter Birthday");
        personOBJ.setpBirthDate(eye.next());
        System.out.println("Please enter Sex");
        personOBJ.setpSex(eye.next());
        setPersonAddress(eye, personOBJ);

        return personOBJ;
    }

    public static pAddress setPersonAddress(Scanner eye, PersonAsObject personOBJ) {
        pAddress personAddress = new pAddress();
        System.out.println("Please enter Street name");
        personAddress.setStreet(eye.next());
        System.out.println("Please enter Postal Number");
        personAddress.setPostalNumber(eye.next());
        System.out.println("Please enter City name");
        personAddress.setCity(eye.next());
        System.out.println("Please enter State name");
        personAddress.setState(eye.next());
        System.out.println("Please enter Country");
        personAddress.setCountry(eye.next());

        personArrList.add(personOBJ.getpFirstName() + " " + personOBJ.getpLastName() + " " + personOBJ.getpBirthDate() + " " + personOBJ.getpSex() + " " + personOBJ.getpAddress() + " " +
                personAddress.getStreet() + " " + personAddress.getPostalNumber() + " " + personAddress.getCity() + " " + personAddress.getState() + " " + personAddress.getCountry());

        printFuncAll(personOBJ, personArrList);

        return personAddress;
    }

    public static PersonAsObject addPersonName(Scanner eye) {

        PersonAsObject personOBJ = new PersonAsObject();
        System.out.println("First name, please enter it");
        personOBJ.setpFirstName(eye.next());
        System.out.println("Last name, I need it!");
        personOBJ.setpLastName(eye.next());


        personArrList.add(personOBJ.getpFirstName() + " " + personOBJ.getpLastName());

        printFuncAll(personOBJ, personArrList);

        return personOBJ;
    }

    public static PersonAsObject addPersonNameSexAndBirthDate(Scanner eye) {

        PersonAsObject personOBJ = new PersonAsObject();
        System.out.println("Please give First name");
        personOBJ.setpFirstName(eye.next());
        System.out.println("Give last Name");
        personOBJ.setpLastName(eye.next());
        System.out.println("Enter Birthday");
        personOBJ.setpBirthDate(eye.next());
        System.out.println("Biological sex, please enter");
        personOBJ.setpSex(eye.next());


        personArrList.add(personOBJ.getpFirstName() + " " + personOBJ.getpLastName() + " " + personOBJ.getpBirthDate() + " " + personOBJ.getpSex());

        printFuncAll(personOBJ, personArrList);

        return personOBJ;
    }

    public static void removePerson(Scanner eye) {
        System.out.println("Here is the List of People saved!\n" +
                "Please select the person you wish to remove by typing the corresponding number to the Person!");
        for (int i = 0; i < personArrList.size(); i++) {
            System.out.println(i + ": " + personArrList.get(i));
        }
        personArrList.remove(personArrList.get(eye.nextInt()));
        printFuncPerson(personArrList);

    }

    public static void printFuncAll(PersonAsObject personOBJ, ArrayList<String> personArrList) {
        System.out.println(personOBJ.getpFirstName() + " " + personOBJ.getpLastName() + " " + personOBJ.getpBirthDate() + " " + personOBJ.getpSex() + " " + personOBJ.getpAddress());

        System.out.println(personArrList);

    }

    public static void printFuncPerson(ArrayList<String> person) {
        System.out.println(person);
    }


}
