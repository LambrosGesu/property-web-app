package gr.codehub.team7.propertywebapp.enums;

public enum Status {
    PENDING("Pending"),
    ONGOING("Ongoing"),
    FINISHED("Finished");

    private String fullName;

    Status(String fullName){
        this.fullName=fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
