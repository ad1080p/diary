import java.util.Scanner;
import java.util.ArrayList;

public class Arrays_bootlescalculator {


    public static void main(String[] args) {
        ArrayList<Integer> isAac = new ArrayList<>();
        isAac.add(0);
        Scanner eye = new Scanner(System.in);
        boolean stop = true;
        int min = isAac.get(0);
        int max = isAac.get(0);
        try {

            System.out.println("Please enter your values to compare! ");
            for (int a = 0; stop; a++) {
                String uI = eye.nextLine();

                if (uI.equals("q")) {
                    stop = false;
                    for (int b = 0; b < isAac.size(); b++) {
                        if (isAac.get(b) < min) min = isAac.get(b);

                        if (isAac.get(b) > max) max = isAac.get(b);


                    }
                    System.out.println(max);
                }
                int uiI = Integer.parseInt(uI);
                isAac.add(uiI);


            }
        }catch(NumberFormatException e){}
    }
}
