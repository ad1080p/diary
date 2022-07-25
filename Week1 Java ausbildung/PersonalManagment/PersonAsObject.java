package PersonalManagment;

public class PersonAsObject {

    private String pFirstName;
    private String pLastName;
    private String pBirthDate;
    private String pSex;
    private String pAddress;

    public PersonAsObject(String pFirstName, String pLastName, String pBirthDate, String pAddress, String pSex) {

        this.pFirstName = pFirstName;
        this.pLastName = pLastName;
        this.pBirthDate = pBirthDate;
        this.pAddress = pAddress;
        this.pSex = pSex;


    }

    public void setpFirstName(String pFirstName) {
        this.pFirstName = pFirstName;
    }

    public void setpLastName(String pLastName) {
        this.pLastName = pLastName;
    }

    public void setpBirthDate(String pBirthDate) {
        this.pBirthDate = pBirthDate;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public PersonAsObject() {

    }

    public String getpFirstName() {
        return pFirstName;
    }

    public String getpLastName() {
        return pLastName;
    }

    public String getpBirthDate() {
        return pBirthDate;
    }

    public String getpSex() {
        return pSex;
    }

    public String getpAddress() {
        return pAddress;
    }
}
