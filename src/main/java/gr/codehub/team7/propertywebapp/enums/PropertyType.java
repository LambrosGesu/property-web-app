package gr.codehub.team7.propertywebapp.enums;

public enum PropertyType {
    FIRSTFLOOR("FirstFloor"),
    MAISONETTE("Maisonette"),
    APPARTMENT("Appartment Buildings");

    private String fullName;

    PropertyType(String fullName){
        this.fullName=fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
