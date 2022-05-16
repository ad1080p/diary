public class FizzBuzz_game {
    public static void main(String[] args) {
        for (int a = 0; a<101;a++){
            if (a%3==0&&a%5==0){
            System.out.println("Fizzbuzz");
        }
            else if (a%3==0){
                System.out.println("Fizz");
            }
            else if (a%5==0){
                System.out.println("Buzz");
            }

            else if (a%3!=0||a%5!=0){
                System.out.println(a);
            }
        }
    }
}
