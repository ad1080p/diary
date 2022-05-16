public class pyramid_scheme {
    public static void main(String[] args) {

        int reihe = 15, z = 0;

        for (int a = 1; a <= reihe; ++a, z = 0) {
            for (int b = 1; b <= reihe*2 - a; ++b) {
                System.out.print("  ");

            }


            while (z != 2 * a - 1) {
                System.out.print("x ");
                ++z;
            }
            System.out.println();

        }
        for(int i=reihe;i>=1;--i){
            for (int platz = 1; platz<=reihe*2 -i; ++platz){
                System.out.print("  ");
            }
            for (int j = i; j<=2*i -1; ++j){
                System.out.print("x ");
            }
            for (int j = 0; j<i -1; ++j){
                System.out.print("x ");
            }
            System.out.println();
        }


    }
}







