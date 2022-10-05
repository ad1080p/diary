package Cameraphotos;

public class Lens extends CameraAsObject {
    int minBurnDistance;
    int maxBurnDistance;

    public Lens(String brand, int megaPixels, int displaySize, boolean coloured) {
        super(brand, megaPixels, displaySize, coloured);
    }

    public Lens() {

    }


    public int getMinBurnDistance() {
        return minBurnDistance;
    }

    public void setMinBurnDistance(int minBurnDistance) {
        this.minBurnDistance = minBurnDistance;
    }

    public int getMaxBurnDistance() {
        return maxBurnDistance;
    }

    public void setMaxBurnDistance(int maxBurnDistance) {
        this.maxBurnDistance = maxBurnDistance;
    }

    @Override
    public String toString() {
        return " Maximum Burn Distance: " + this.maxBurnDistance + " Minimum Burndistance: " + this.minBurnDistance;
    }
}
