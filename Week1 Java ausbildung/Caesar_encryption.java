public class Caesar_encryption {
    public static void main(String[] args) {
        int s = 6;
        String text = "Ein Charakter namens Caesar!";


    }
    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for (int a = 0; a < text.length(); a++) {
            if (Character.isUpperCase(text.charAt(a))) {
                char ch = (char) (((int) text.charAt(a) + s - 65) % 26 + 65);
                result.append(ch);
            }


            else {
                char ch = (char) (((int) text.charAt(a) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
}
    public static StringBuffer decrypt(String text, int offset) {

        return encrypt(text, 26 - (offset % 26));
    }
}

