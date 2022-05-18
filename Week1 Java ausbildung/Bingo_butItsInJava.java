import java.util.ArrayList;
import java.lang.Math;

public class Bingo_butItsInJava {
    public static void main(String[] args) {
        int nAr[][] = new int[5][5];
        ArrayList<Integer> arrL = new ArrayList<>();
        boolean duplicate = false;
        int rand = 0;

        for (int i = 0; i < nAr.length; i++) {
            for (int aR = 0; aR < nAr.length; aR++) {
                while (!duplicate) {
                    rand = (int) ((Math.random() * 15) + 1+15 * i);

                    if (!arrL.contains(rand)) {
                        duplicate = true;
                        arrL.add(rand);
                    }
                }
                nAr[aR][i] = rand;
                duplicate = false;
            }
        }
        nAr[2][2] = 0;

        String bingo[] ={"B","I","N","G","O"};

        for (int i=0;i<bingo.length;i++){
            System.out.print(bingo[i]+"\t");
        }
        System.out.println();

        for (int i = 0; i < nAr.length; i++) {
            for (int j = 0; j < nAr.length; j++) {
                System.out.print(nAr[i][j] + "\t");
            }
            System.out.println("");
        }


    }
}
