import com.sun.nio.sctp.SendFailedNotification;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Pizzatime_spindelmann {
    public static void main(String[] args) {

        Random random = new Random();

        String movie[] = new String[6];
        String times[] = new String[6];
        String saal[] = new String[6];
        Boolean verfugbarkeit[] = new Boolean[6];
        Boolean dimension[] = new Boolean[6];
        String uhrZeit = "14:20";
        double geldbörse = 122.80;
        double essenP[] = new double[4];
        String essen[] = new String[4];
        double totalsum = 0;

        boolean filmboo = false;
        int zeit = 15;
        int ticketNr = random.nextInt(1001);

        essen[0] = "Leberkas";
        essen[1] = "Schoko";
        essen[2] = "Kartoffel";
        essen[3] = "Cola";

        essenP[0] = 2.55;
        essenP[1] = 5.250;
        essenP[2] = 50;
        essenP[3] = 2.990;


        dimension[0] = true;
        dimension[1] = true;
        dimension[2] = false;
        dimension[3] = true;
        dimension[4] = false;
        dimension[5] = true;

        movie[0] = "Revenge of Kanye";
        movie[1] = "Pootis Reloaded";
        movie[2] = "We Learned how to Box";
        movie[3] = "Reddit mod vs Facebook Karen";
        movie[4] = "MFDOOM eating cereal AMSR";
        movie[5] = "The 3rd Coming";

        verfugbarkeit[0] = true;
        verfugbarkeit[1] = false;
        verfugbarkeit[2] = true;
        verfugbarkeit[3] = false;
        verfugbarkeit[4] = true;
        verfugbarkeit[5] = false;

        times[0] = "16:20";
        times[1] = "22:45";
        times[2] = "14:30";
        times[3] = "13:20";
        times[4] = "15:30";
        times[5] = "12:20";

        saal[0] = "Saal 1";
        saal[1] = "Saal 2";
        saal[2] = "Saal 3";
        saal[3] = "Saal 4";
        saal[4] = "Saal 5";
        saal[5] = "Saal 6";

        //Filmtafel
        for (int a = 0; a < dimension.length; a++) {


            if (dimension[a] == true) {
                if (verfugbarkeit[a] == true) {
                    String verfugbarkeitW = "Verfügbar";
                    String dimensionWort1 = "3D";
                    System.out.println(movie[a] + "/" + dimensionWort1 + "/" + times[a] + "/" + saal[a] + "/" + verfugbarkeitW);
                } else {
                    String verfugbarkeitW = "Ausgebucht";
                    String dimensionWort = "3D";
                    System.out.println(movie[a] + "/" + dimensionWort + "/" + times[a] + "/" + saal[a] + "/" + verfugbarkeitW);
                }

            } else {
                if (verfugbarkeit[a] == true) {
                    String verfugbarkeitW = "Verfügbar";
                    String dimensionWort = "2D";
                    System.out.println(movie[a] + "/" + dimensionWort + "/" + times[a] + "/" + saal[a] + "/" + verfugbarkeitW);
                } else {
                    String verfugbarkeitW = "Ausgebucht";
                    String dimensionWort1 = "2D";
                    System.out.println(movie[a] + "/" + dimensionWort1 + "/" + times[a] + "/" + saal[a] + "/" + verfugbarkeitW);
                }
            }

        }
        //Abfrage welchen film du schauen willst
        Scanner input = new Scanner(System.in);
        System.out.println("what movie would u like to watch?");
        String movieuwant = input.nextLine();

        boolean fehleingabe = true;
        for (int b = 0; (b < movie.length) && fehleingabe; b++) {

            if (movie[b].equals(movieuwant)) {

//abfrage ob der Film vefügbar ist
                if (verfugbarkeit[b] == true) {
                    System.out.println("Wollen sie ein Ticket für diesen Film?");
                    String antwortIn = input.nextLine();
                    String antwortJa = "Ja";


                    if (antwortIn.equals(antwortJa)) {

                        int movieAr = b; //Film abspeichern
                        System.out.println("Wunderbar!");


                        if (zeit >= 10) {
                            System.out.println("Du hast mehr als 10 min zeit!");
                            System.out.println("Zuerst gehst aufs Klo, dann kaufst du essen!");
                            System.out.println("Was möchtest du bestellen?");
                            //abfrage zum bestellen
                            for (int c = 0; (c < essen.length); c++) {

                                System.out.println(essen[c] + "/" + essenP[c] + "€");

                            }


                            for (int c = 0; (c < essen.length); c++) {

                                System.out.println("");
                                System.out.println(essen[c] + "/" + essenP[c] + "€");
                                String antwortIn2 = input.nextLine();






                                if (antwortIn2.equals("Ja")) {
                                    totalsum += essenP[c]; //dynamisch ausgerechneten gesamt preis
                                    //ticket das gespeichert wird



                                    //Gesamt preis ausgabe und rest geld rechnung


                                    if (totalsum <= geldbörse&&c==3) {
                                        geldbörse -= totalsum;
                                        System.out.println("Hier bitte!");
                                        System.out.println("Dein gesamt preis ist: " + totalsum);
                                        System.out.println("Hier ist dein restgeld: " + geldbörse);
                                        filmboo = true;
                                    }


                                 else if (totalsum> geldbörse){
                                    System.out.println("Du hast nicht genug geld!");
                                 }
                                }
                            }
                        } else {
                            System.out.println("Du hast weniger als 10 min zeit!");
                            System.out.println("Renne zum Klo!");

                        }


                    } else {
                        System.out.println("Bitte wählen sie einen Film den sie sehen wollen!");
                        fehleingabe = false;
                    }


                } else {
                    System.out.println("dieser film nicht verfügbar");
                    fehleingabe = false;


                }
            } else if (movieuwant.equals("")) {
                System.out.println("Bitte wählen sie einen Film aus!");
                fehleingabe = false;
            }
        }
        if (filmboo) {
            System.out.println("Wenn prim oder ganzer 10er, gewinnst du gratis essen!");
            System.out.println();




            System.out.println();
            System.out.println("Du hast die Nummer " + ticketNr + " gezogen!");
            System.out.println();

            System.out.println();
            if (ticketNr % 10 == 0 || ticketNr % ticketNr == 0 && ticketNr % 1 == 0 && ticketNr % 2 != 0 && ticketNr % 3 != 0 || ticketNr == 2 || ticketNr == 3) {
                System.out.println("Ist eine runde Zahl oder ein Primzahl!");
                System.out.println("Du hast Gewonnen! Viel Spaß mit deinem Gratis essen und dem Film!");
            } else {
                System.out.println("Leider nicht gewonnen!");
                System.out.println("Tut uns leid du musst dein Essen bezahlen!");
            }
        }


    }

}













