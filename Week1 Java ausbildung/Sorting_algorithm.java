import java.util.Random;
public class Sorting_algorithm {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] numbers = new int[10];
        System.out.println("Before: ");

        for (int i = 0;i < numbers.length;i++){
            numbers[i]=rand.nextInt(100);
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();



        for (int i = 1; i< numbers.length;i++){
            int cA = numbers[i];

            int j = i-1;
            while (j>=0&&cA<numbers[j]){
                numbers[j+1]=numbers[j];
                j--;
                
            }
            numbers[j+1]=cA;


        }
        System.out.println("After: ");
        for (int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }





    }
}
