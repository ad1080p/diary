public class WorkingWithStrings {
    public static void main(String[] args) {

        String allWorld = " Hello World! ";
        int longht = allWorld.length();

        System.out.println("String: "+allWorld+" String length: "+ longht);
        System.out.println(allWorld.toLowerCase());
        System.out.println(allWorld.toUpperCase());

        String noWorld = allWorld.replace("World","Codersbay");
        System.out.println(noWorld);

        String darkWorld = allWorld.replace(" Hello", "Hello");
        System.out.println(darkWorld);

        for (int a = 0; a<15; a++){
            System.out.println(allWorld);
        }
    }
}
