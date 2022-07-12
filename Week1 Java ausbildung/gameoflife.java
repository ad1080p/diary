import java.util.concurrent.TimeUnit;

public class gameoflife {
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

        System.out.println("Origin gen: ");
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

    public static int getNeighbourCount(int grid[][], int x, int y) {
        int count = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                count += getCellValue(grid, i, j);

            }

        }
        count -= getCellValue(grid, x, y);


        return count;


    }


    public static void aliveOrDead(int grid[][]) {

        int a = grid.length;
        int b = grid[0].length;
        int genCount= 0;


        int[][] newGen = new int[a][b];
        for (int gen = 0; gen < 15; gen++) {
            for (int xx = 0; xx < a; xx++) {
                for (int yy = 0; yy < b; yy++) {

                    var count = getNeighbourCount(grid, xx, yy);

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
            genCount++;

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("New gen: "+ genCount );
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {

                    System.out.print(newGen[i][j] + "\t");

                }
                System.out.println();
            }
            for (int i = 0; i < a; i++){
                for (int j = 0; j < b;j++){
                    grid[i][j]= newGen[i][j];
                }
            }



        }

        // pulseChecker(count, x, y, grid, newGen);


    }
}


