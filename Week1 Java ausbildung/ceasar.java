import java.util.Locale;

public class ceasar {
    public static void main(String[] args) {
        String text = "Du elendiger bastard!";
        int key = 6;
        String ciphertext = code(text, key);
        System.out.println("normal: "+ text +" encrypted: "+ ciphertext);
        System.out.println(ciphertext);

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
