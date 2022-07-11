public class gameOfLife {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;


        int[][] grid = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(grid[i][j] + "\t");

            }
            System.out.println();
        }
        aliveOrDead(grid);


    }

    public static int getCellValue(int grid[][], int xx, int yy) {
        //if (x < 0 || x > grid.length || y < 0 || y > grid[0].length)
        //    return 0;
        try {

            return grid[xx][yy];

        } catch (ArrayIndexOutOfBoundsException ex) {
            return 0;
        }

    }

    public static int getNeighbourCount(int grid[][], int xx, int yy) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                count += getCellValue(grid, i, j);

            }
        }


        count -= getCellValue(grid, xx, yy);
        System.out.println(count);
        return count;


    }


    public static void aliveOrDead(int grid[][]) {

        int a = grid.length;
        int b = grid[0].length;




        int[][] newGen = new int[a][b];

        for (int xx = 0; xx < a; xx++) {
            for (int yy = 0; yy < b; yy++) {

              var count = getNeighbourCount(grid,xx,yy);

                if ((grid[xx][yy] == 1) && (count < 2)) {
                    newGen[xx][yy] = 0;
                } else if ((grid[xx][yy] == 1) && (count > 3)) {
                    newGen[xx][yy] = 0;
                } else if ((grid[xx][yy] == 0) && (count == 3)) {
                    newGen[xx][yy] = 1;
                } else {
                    newGen[xx][yy] = grid[xx][yy];
                }
            }
        }
        System.out.println("New gen: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(newGen[i][j] + "\t");

            }
            System.out.println();
        }


        // pulseChecker(count, x, y, grid, newGen);


    }

 /*   public static void pulseChecker(int count, int x, int y, int[][] grid, int[][] newGen) {


        if ((grid[x][y] == 1) && (count < 2)) {
            newGen[x][y] = 0;
        } else if ((grid[x][y] == 1) && (count > 3)) {
            newGen[x][y] = 0;
        } else if ((grid[x][y] == 0) && (count == 3)) {
            newGen[x][y] = 1;
        } else {
            newGen[x][y] = grid[x][y];
        }

        System.out.println("New gen: ");
        for (int i = 0; i < newGen.length; i++) {
            for (int j = 0; j < newGen[0].length; j++) {
                System.out.print(newGen[i][j] + "\t");

            }
            System.out.println();
        }
*/

}