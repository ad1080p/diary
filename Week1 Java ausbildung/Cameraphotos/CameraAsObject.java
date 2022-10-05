package Cameraphotos;

public class CameraAsObject {

    String brand;
    int megaPixels;
    int displaySize;
    boolean coloured;

    public CameraAsObject(String brand, int megaPixels, int displaySize, boolean coloured) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.coloured = coloured;
    }

    public CameraAsObject() {

    }

    public static void toString(CameraAsObject cameraAsObject) {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isColoured() {

        return coloured;
    }

    public void setColoured(boolean coloured) {
        this.coloured = coloured;
    }

    @Override
    public String toString() {
        return this.brand + " | " + this.displaySize + " | " + this.megaPixels + " | " + "Coloured? " + this.isColoured();
    }


}
