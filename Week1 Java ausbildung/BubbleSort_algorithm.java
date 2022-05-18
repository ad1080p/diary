import java.util.Random;
public class BubbleSort_algorithm {

    public static void  bubbleSort(int[]a){
        boolean sD = false;
        int temp;
        System.out.println();

        while (!sD){
            sD=true;
            for (int i = 0; i<a.length-1;i++){
                if (a[i]>a[i+1]){
                    sD = false;
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1]=temp;


                }
            }
        }
        for (int i = 0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

    }

    public static void main(String[] args) {

       int[] a= new int[10];
       Random rand = new Random();

        for (int i = 0;i < a.length;i++){
            a[i]=rand.nextInt(100);
            System.out.print(a[i]+ " ");
        }
        bubbleSort(a);

    }
}
