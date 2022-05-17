import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Scanner;
public class Leetspeak_forgeeks {
    public static void main(String[] args) {
        Scanner eye = new Scanner(System.in);
        String uI = eye.nextLine().toUpperCase();
        StringBuilder sB = new StringBuilder();
        Map<Character, Character> m = new HashMap<>(){{
            put('A', '@');
            put('B', '8');
            put('C', '(');
            put('D','D');
            put('E','3');
            put('F', 'F');
            put('G','6');
            put('H', '#');
            put('I', '!');
            put('K', 'K');
            put('L', '1');
            put('M', 'M');
            put('N', 'N');
            put('O','0');
            put('P', 'P');
            put('Q','Q');
            put('R', 'R');
            put('S', '$');
            put('T', '7');
            put('U','U');
            put('V', 'V');
            put('W','W');
            put('X', 'X');
            put('Y', 'Y');
            put('Z','Z');

        }};
        for (Character c: uI.toCharArray()){
            Character a = m.getOrDefault(c,c);
            sB.append(a);
        }
        System.out.println(sB);


    }
}
