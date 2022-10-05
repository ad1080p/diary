package Cameraphotos;

public class CreateObjects {
    public static void main(String[] args) {
        CamAndLens camR = new CamAndLens();
        camR.addCamera("Sony", 1080, 1, true, 1, 10);
        camR.addCamera("Sony", 1080, 2, true, 2, 10);
        camR.addCamera("Sony", 1080, 3, true, 3, 10);
        camR.addCamera("Sony", 1080, 4, true, 4, 3);

        camR.amountPrint();

    }
}
