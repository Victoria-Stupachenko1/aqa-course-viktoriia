package oop;

public class Manager extends User {
    // Private fields
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    // Constructor
    public Manager(String fullName, String email, String role, String position) {
        super (fullName, email, role);
        this.position = position;
    }

    // Method
    public void printUserInfo() {
        super.printUserInfo ( );
        System.out.println (position + ", " + responsibilityDistrict + ", " + workPhoneNumber);
    }

    // Getters & Setters
    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }
    public String getWorkPhoneNumber() {
        return getPhoneNumber ();
    }

    @Override
    public String toString() {
        return "Manager [position=" + position + ", Responsibility District=" + responsibilityDistrict
                + ", Work Phone Number =" + workPhoneNumber + "]";
    }


    //manager is an user that contains additional private fields: position; responsibilityDistrict; workPhoneNumber.
    // Manager object can be created, like user object, but additionally must have position value in process of creation.
    // All additional fields must have getters and setters. Also, manager has the same method printUserInfo,
    // like a user, but this method additionally print all additional fields of manager.
}
