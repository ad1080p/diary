package PersonalManagment;

public class pAddress extends PersonAsObject {
    private String street;
    private String postalNumber;
    private String city;
    private String state;
    private String country;

    public pAddress(String pFirstName, String pLastName, String pBirthDate, String pAddress, String pSex) {
        super(pFirstName, pLastName, pBirthDate, pAddress, pSex);
    }

    public pAddress() {

    }

    public String getStreet() {
        return street;
    }

    public String getPostalNumber() {
        return postalNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public void setPostalNumber(String postalNumber) {
        this.postalNumber = postalNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}


