package Cameraphotos;

public class CamAndLens {
    static int countCam = 0;
    static int countLens = 0;

    CameraAsObject cameraAsObject = new CameraAsObject();

    public CameraAsObject addCamera(String bName, int mPData, int dData, boolean iCData, int minData, int maxData) {

        if (minData > maxData) {
            System.out.println("Minimum is not allowed to be greater than maximum value! ");
        } else {
            cameraAsObject.setBrand(bName);
            cameraAsObject.setMegaPixels(mPData);
            cameraAsObject.setDisplaySize(dData);
            cameraAsObject.setColoured(iCData);
            System.out.println(cameraAsObject);
            
            countCam++;

            addLensDetails(minData, maxData);
        }

        return cameraAsObject;
    }

    public Lens addLensDetails(int minData, int maxData) {
        Lens lensDetails = new Lens();

        lensDetails.setMinBurnDistance(minData);
        lensDetails.setMaxBurnDistance(maxData);

        System.out.println(lensDetails);
        countLens++;

        return lensDetails;
    }

    public void amountPrint() {
        System.out.println("Amount of Cameras: " + countCam);
        System.out.println("Amount of Lenses: " + countLens);
    }
}
