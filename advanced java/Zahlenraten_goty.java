import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Zahlenraten_goty {

    public static void tutorial() {
        System.out.println("How to play: \n " +
                "Level1: Your objective is to guess a Number from 1-100 within 9 tries!\n" +
                "Level2: Same as level 1, except this time you dont get hints that tell you wether its more or less!\n" +
                "Level3: Its still the same game, with a twist, this time you Play against an AI, good luck!");
        hub();
    }

    public static void stage1() {
        Random random = new Random();
        int numberToCompare = random.nextInt(100);
        numberToCompare += 1;
        Scanner auge2 = new Scanner(System.in);
        int[] numbers = new int[10];
        String tryagain;
        boolean boop = true;

        for (int a = 0; a < 10 && boop; a++) {
            String playerGuess = auge2.nextLine();
            int hint = Integer.parseInt(playerGuess);
            numbers[a] = hint;
            System.out.println();

            if (hint != numberToCompare && boop) {
                if (a <= 8) {
                    if (hint < numberToCompare) {
                        System.out.println("More!");
                        System.out.println((10 - (a + 1)) + " tries left!");
                    } else if (hint > numberToCompare) {
                        System.out.println("Less!");
                        System.out.println((10 - (a + 1)) + " tries left!");
                    } else {
                        System.out.println("Wanna go again? y/n");
                        tryagain = auge2.nextLine();
                        if (tryagain.equals("y")) {
                            a = 0;
                            numberToCompare = random.nextInt(100);
                            System.out.println("Enter your guess!: ");
                        } else if (tryagain.equals("n")) {
                            System.out.println("We will see you soon!");
                            boop = false;
                        }
                    }

                }
            } else if (hint == numberToCompare) {
                System.out.println("your guess was: " + hint);
                System.out.println("the correct value was: " + numberToCompare);
                System.out.println("Congratulations, you won an Iphone 5s!");
                System.out.println("Would you like to go again? y/n");
                tryagain = auge2.nextLine();
                if (tryagain.equals("y")) {
                    a = 0;
                    numberToCompare = random.nextInt(100);
                    System.out.println("Enter your guess!: ");
                } else if (tryagain.equals("n")) {
                    System.out.println("too bad, we hope you enjoyed your stay!");
                    boop = false;

                }

            }
        }


    }

    public static void stage2() {
        Random random = new Random();
        int numberToCompare = random.nextInt(100);
        numberToCompare += 1;
        Scanner auge2 = new Scanner(System.in);
        int[] numbers = new int[10];
        String tryagain;
        boolean boop = true;
        ArrayList<String> arrL = new ArrayList<String>();

        for (int a = 0; a < 10 && boop; a++) {
            String playerGuess = auge2.nextLine();
            arrL.add(playerGuess);
            int hint = Integer.parseInt(playerGuess);
            int sum;
            numbers[a] = hint;
            System.out.println();

            if (hint != numberToCompare && boop) {
                if (a <= 8) {
                    if (hint < numberToCompare) {
                        System.out.println("Your guesses thusfar: " + arrL);
                        sum = numberToCompare - hint;
                        if (sum <= 5) {
                            System.out.println("Not bad!");
                            if (sum <= 2) {
                                System.out.println("Omg youre so close!!!");
                            }
                        }
                        if (sum > 5) {
                            System.out.println("Completely off!");
                        }
                        System.out.println((10 - (a + 1)) + " tries left!");
                    } else if (hint > numberToCompare) {
                        System.out.println("Your guesses thusfar: " + arrL);
                        sum = numberToCompare - hint;
                        if (sum <= 5) {
                            System.out.println("not bad!");
                            if (sum <= 2) {
                                System.out.println("Omg youre so close!!!");
                            }
                        }
                        if (sum > 5) {
                            System.out.println("Completely off!");
                        }
                        System.out.println((10 - (a + 1)) + " tries left!");
                    } else {
                        System.out.println("Wanna go again? y/n");
                        tryagain = auge2.nextLine();
                        if (tryagain.equals("y")) {
                            a = 0;
                            numberToCompare = random.nextInt(100);
                            System.out.println("Enter your guess!: ");
                        } else if (tryagain.equals("n")) {
                            System.out.println("We will see you soon!");
                            boop = false;
                        }
                    }

                } else {
                    System.out.println("you lost!");
                    System.out.println("Wanna go again? y/n");
                    arrL.clear();
                    tryagain = auge2.nextLine();
                    if (tryagain.equals("y")) {
                        a = 0;
                        numberToCompare = random.nextInt(100);
                        System.out.println("Enter your guess!: ");
                    } else if (tryagain.equals("n")) {
                        System.out.println("We will see you soon!");
                        boop = false;
                    }
                }
            } else if (hint == numberToCompare) {
                System.out.println("your guesses have been: " + arrL);
                System.out.println("the correct value was: " + numberToCompare);
                System.out.println("Congratulations, you won an Iphone 5s!");
                System.out.println("Would you like to go again? y/n");
                tryagain = auge2.nextLine();
                if (tryagain.equals("y")) {
                    a = 0;
                    numberToCompare = random.nextInt(100);
                    System.out.println("Enter your guess!: ");
                } else if (tryagain.equals("n")) {
                    System.out.println("too bad, we hope you enjoyed your stay!");
                    boop = false;

                }

            }
        }


    }

    public static void stage3() {
        Random random = new Random();
        int numberToCompare = random.nextInt(100);
        numberToCompare += 1;
        Scanner auge2 = new Scanner(System.in);
        int[] numbers = new int[10];
        String tryagain;
        boolean boop = true;
        String playerGuess;
        int hint;
        int min = 0;
        int max = 101;
        int begin=0;
        ArrayList<Integer> arrL = new ArrayList<>();

        for (int b = 0; b <= 10&&boop; b++) {


            boolean beginB = false;
            if (b == 0) {
                do {
                    begin = random.nextInt(3);
                    if (begin == 1 || begin == 2) {
                        beginB = true;
                    }
                } while (beginB == false);
            } else if (b == 10) {
                System.out.println();
                System.out.println("The number was: " + numberToCompare);
                System.out.println("Do you want to try again? y/n");
                tryagain = auge2.nextLine();
                if (tryagain.equals("y")) {
                    b = 0;
                    numberToCompare = random.nextInt(100);
                    System.out.println("Enter your guess!: ");
                } else if (tryagain.equals("n")) {
                    System.out.println("Too bad, see you next time!");
                }
            } else {
                if (begin == 1) {
                    System.out.println();
                    System.out.println("Your turn, Enter your guess: ");
                    playerGuess = auge2.nextLine();
                    hint = Integer.parseInt(playerGuess);
                    numbers[b] = hint;

                    if (hint != numberToCompare) {
                        if (b <= 8) {
                            if (hint < numberToCompare) {
                                System.out.println("More!");
                                System.out.println((10 - (b + 1)) + " tries left!");

                                arrL.add(hint);
                                begin = 2;
                            } else if (hint > numberToCompare) {
                                System.out.println("Less!");
                                System.out.println((10 - (b + 1)) + " tries left!");
                                arrL.add(hint);
                                begin = 2;
                            } else {
                                System.out.println("Wanna go again? y/n");
                                tryagain = auge2.nextLine();
                                if (tryagain.equals("y")) {
                                    b = 0;
                                    numberToCompare = random.nextInt(100);
                                    System.out.println("Enter your guess!: ");
                                } else if (tryagain.equals("n")) {
                                    System.out.println("We will see you soon!");
                                    boop = false;
                                }
                            }
                        }

                        }
                    else if (hint==numberToCompare){
                        System.out.println("Congratulations, you won!");
                        System.out.println("Want to try again? y/n");
                        tryagain = auge2.nextLine();
                        if (tryagain.equals("y")){
                            b=0;
                            min = 0;
                            max = 101;
                            numberToCompare = random.nextInt(100);
                            System.out.println("Enter your guess: ");
                        }
                        else if (tryagain.equals("n")){
                            System.out.println("too bad, see you soon!");
                        }

                    }
                }
                if (begin==2){
                    System.out.println();
                    System.out.println("AI guess: ");
                    hint = ((max-min)/2+min);
                    System.out.println(hint);
                    numbers[b] = hint;
                    System.out.println();


                    if (hint !=numberToCompare){

                        if (b<9){



                            if(hint>numberToCompare){
                                System.out.println("Less!");
                                System.out.println((10-(b))+ " Tries left!");
                                arrL.add(hint);
                                begin = 1;
                                max = hint;
                            }
                            else if (hint<numberToCompare){
                                System.out.println("More!");
                                System.out.println((10-(b))+" Tries left!");
                                arrL.add(hint);
                                begin = 1;
                                min = hint;
                            }

                        }
                        else {
                            System.out.println("Want to try again? y/n" );
                            tryagain = auge2.nextLine();
                            if (tryagain.equals("y")){
                                b=0;
                                numberToCompare = random.nextInt(100);
                                System.out.println("Enter your guess!: ");

                            }else if (tryagain.equals("n")){
                                System.out.println("too bad, see you soon!");
                                boop = false;
                            }
                        }
                    } else if (hint==numberToCompare){
                        System.out.println("Dumb AI won against you!");
                        System.out.println("Want to try again? y/n");
                        tryagain = auge2.nextLine();
                        if (tryagain.equals("y")){
                            b=0;
                            min=0;
                            max=101;
                            numberToCompare = random.nextInt(100);
                            System.out.println("Enter your guess: ");
                        }
                        else if (tryagain.equals("n")){
                            System.out.println("too bad, see you soon!");
                            boop=false;
                        }
                    }

                }
            }


        }
    }

    public static void hub() {

        System.out.println("Select a level from 1-3! Press 4 to get to the tutorlial!");

        Scanner auge = new Scanner(System.in);

        int challengeSelection;

        challengeSelection = auge.nextInt();


        if (challengeSelection == 1) {
            System.out.println("Welcome to Level 1!");
        } else if (challengeSelection == 2) {
            System.out.println("Welcome to Level 2!");
        } else if (challengeSelection == 3) {
            System.out.println("Welcome to Level 3!");
        } else if (challengeSelection == 4) {
            System.out.println("Welcome to the tutorial!");
        } else {
            System.out.println("Wrong value! Read Instructions carefully!");
        }
        int levelSelection = challengeSelection;


        switch (levelSelection) {
            case 1:

                System.out.println("Enter your first guess!: ");
                stage1();
                break;


            case 2:

                System.out.println("Enter your first guess!: ");
                stage2();
                break;

            case 3:
                System.out.println("Welcome to Bot Hell! ");
                stage3();
                break;

            case 4:
                tutorial();
                break;
        }
    }


    public static void main(String[] args) {
        hub();
    }

}


