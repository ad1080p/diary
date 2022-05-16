import java.io.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.StringWriter;

public class encryption_cäsar_salat {
    public static void main(String[] args) {
        rEader();
        // wRiter(text1);
    }


    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for (int a = 0; a < text.length(); a++) {
            if (Character.isUpperCase(text.charAt(a))) {
                char ch = (char) (((int) text.charAt(a) + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(a) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;

    }

    public static StringBuffer decrypt(String text, int offset) {
        return encrypt(text, 26 - (offset % 26));
    }

    public static String rEader() {
        int s = 3;

        try {
            String text = new String(Files.readAllBytes(Paths.get("input.txt")));
            FileReader reader = new FileReader("input.txt");
            int data = reader.read();


            while (data != -1) {

                data = reader.read();

            }

            reader.close();
            System.out.println(encrypt(text, s));
            System.out.println(decrypt(text, 26));
            if (data == -1) {

                return text;

            }
            //    return
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return rEader();
    }

/*    public static String wRiter(String text){

        int s = 3;
        StringWriter out = new StringWriter();
        String text1 = encrypt(text,s).toString();
        String string = out.toString();
        try {
            File outPut = new File("Output.txt");
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("Output.txt");


            //String text2=  ;
            StringBuffer text3= decrypt(text1,s);


            // Writes string to the file
          output.write(text1);


            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();


        }


        return text1;

 */
}

