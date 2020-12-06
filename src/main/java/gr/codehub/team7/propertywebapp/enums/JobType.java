package gr.codehub.team7.propertywebapp.enums;

public enum JobType {
    PAINTING("Painting"),
    ISOLATION("Isolation"),
    FRAMES("Frames"),
    PLUMBING("Plumbing"),
    ELECTRICAL("Electrical");

    private String fullName;

    JobType(String fullName){
        this.fullName=fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
