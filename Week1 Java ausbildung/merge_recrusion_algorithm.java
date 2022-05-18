import java.util.Random;
public class merge_recrusion_algorithm {

    public static void mergeSplit(int[] big){
        int bigLength = big.length;

        if (bigLength<2){
            return;
        }
        int midLength = bigLength/2;
        int [] half1 = new int[midLength];
        int [] half2 = new int[bigLength-midLength];

        for (int i = 0; i<midLength;i++){
            half1[i] = big[i];
        }
        for (int i = midLength; i<midLength;i++){
            half2[i-midLength] = big[i];
        }
        mergeSplit(half1);
        mergeSplit(half2);

        merge(big,half1,half2);
    }
    public static void merge(int[]big, int[]half1,int[]half2){
        int size1 = half1.length;
        int size2 = half2.length;

        int i = 0, j=0 , k=0;

        while (i<size1&&j<size2){
            if (size1 <= size2){
                big[k] = half1[i];
                i++;
            }else {
                big[k] = half2[j];
                j++;
            }
            k++;
        }
        while (i<size1){
            big[k] = half1[i];
            i++;
            k++;
        }
        while (j<size2){
            big[k] = half2[j];
            j++;
            k++;
        }


    }
    public static void main(String[] args) {
        int[] big = new int[100000000];
        Random rand = new Random();


        for (int i = 0; i<big.length;i++){

            int bigV=rand.nextInt(1000);
            big[i]=bigV;

        }

        mergeSplit(big);
    }

}
