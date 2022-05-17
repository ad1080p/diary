import java.util.Scanner;
import java.util.Random;
public class Caesar_encryption {
    public static void main(String[] args) {
        Scanner eye = new Scanner(System.in);
        System.out.println("Please enter text to start encrypting!");
        String text = eye.nextLine();
        Random random = new Random();
        int key=random.nextInt(26);

        String ciphertext = code(text, key);
        System.out.println("normal: "+ text +" encrypted: "+ ciphertext);
        String decoded = decode(ciphertext, key);
        System.out.println("decrypted: "+ decoded+ " encrypted: "+ ciphertext);

    }
    public static String code(String text, int key){
        String cipher ="";
        text=text.toLowerCase();
        for (int a = 0 ; a<text.length();a++){
            char next = text.charAt(a);
            cipher=cipher+shift(next,key);
        }
        return cipher;
    }
    public static char shift(char letter, int shift){
        if (letter >='a'&& letter<='z'){
            letter+=shift;
            while (letter>'z'){
                letter-=26;
            }
        }
        return letter;
    }

    public static String decode(String ciphertext, int key){
        String decoded ="";
        ciphertext=ciphertext.toLowerCase();
        for (int a=0; a<ciphertext.length();a++){
            char next = ciphertext.charAt(a);
            decoded = decoded + shift(next, 26-key);
        }
        return decoded;
    }
}