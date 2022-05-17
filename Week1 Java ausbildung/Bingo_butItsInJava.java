
import java.util.Random;

public class Bingo_butItsInJava {
    public static void main(String[] args) {
        int nAr[][] = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < nAr.length; i++) {
            nAr[i][0] = random.nextInt(15+1-1)+1;
            nAr[i][1] = random.nextInt(30+1-16)+16;
            nAr[i][2] = random.nextInt(45+1-31)+31;
            nAr[i][3] = random.nextInt(60+1-46)+46;
            nAr[i][4] = random.nextInt(75+1-61)+61;
        }

        for (int i = 0; i < nAr.length; i++) {
            for (int j = 0; j < nAr.length; j++) {
                System.out.print(nAr[i][j] + "       ");
            }
            System.out.println("");
        }


    }


}

