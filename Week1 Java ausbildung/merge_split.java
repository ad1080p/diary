import java.util.Random;
public class merge_split {




    public static void mergeSplit(int[] bigAr) {
        int bigLength = bigAr.length;



        if (bigLength < 2) {
            return;
        }
        int midLength = bigLength / 2;

        int[] half1 = new int[midLength];
        int[] half2 = new int[bigLength - midLength];

        for (int i = 0; i < midLength; i++) {
            half1[i] = bigAr[i];
        }
        for (int i = midLength; i < bigLength; i++) {
            half2[i - midLength] = bigAr[i];
        }
        mergeSplit(half1);
        mergeSplit(half2);

        merge(bigAr, half1, half2);
    }

    public static void merge(int[] bigAr, int[] half1, int[] half2) {
        int size1 = half1.length;
        int size2 = half2.length;

        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (half1[i] <= half2[j]) {
                bigAr[k] = half1[i];
                i++;
            } else {
                bigAr[k] = half2[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            bigAr[k] = half1[i];
            i++;
            k++;
        }
        while (j < size2) {
            bigAr[k] = half2[j];
            j++;
            k++;
        }




    }
    public static void printMax(int[]bigAr){
        int maxNum = bigAr[0];

        for (int i : bigAr){
            if (i>maxNum){
                maxNum = i;
            }
        }
        System.out.println(maxNum);
    }
    public static void printArr (int[]big){
        for (int i = 0; i < big.length;i++){
            System.out.print(big[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] big = new int[10];
        Random rand = new Random();


        for (int i = 0; i < big.length; i++) {

            big[i] = rand.nextInt(1000);


        }

        printArr(big);



        mergeSplit(big);
        printArr(big);
        printMax(big);




    }

}
