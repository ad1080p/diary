package com.company;

public class myself {
    public static void main(String[] args) {
        String firstName = "Richard";
        String lastName = "Ostojic";
        char sex = 'm';
        int age = 21;
        int[] birthday = new int[3];
        birthday[0] = 16;
        birthday[1] = 4;
        birthday[2] = 2001;
        boolean married = false;
        int gradeAverage = 2;

        System.out.println("My name is: "+firstName+lastName);
        System.out.println("My sex/gender is: "+sex);
        System.out.println("I am "+age+" years old!");
        System.out.println("Am I married? "+ married+ " Welp, theres your answere!");
        System.out.println("My average grade in highschool was: "+ gradeAverage);

        for (int a = 0; a < birthday.length;a++){
            System.out.print(birthday[a]+"/" );
        }
        System.out.println(" Is the day I was born!");


    }
}
