package oop;

public class Roles {
    // private fields
    private final boolean viewAll;
    private final boolean editAll;
    private final boolean addAll;
    private final boolean deleteAll;
    private String role;

    // Constructor
    public Roles(String role) {
        this.role = role;
        switch (role) {
            case "Admin" -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = true;
            }
            case "Viewer" -> {
                viewAll = true;
                editAll = false;
                addAll = false;
                deleteAll = false;
            }
            case "Customer" -> {
                viewAll = true;
                editAll = false;
                addAll = true;
                deleteAll = false;
            }
            case "Main Customer" -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = false;
            }
            default -> {
                viewAll = false;
                editAll = false;
                addAll = false;
                deleteAll = false;
            }
        }

    }

    // Getters & Setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role [role=" + role + "]";
    }

    // There are 4 types of roles: Admin, Main Customer, Customer and Viewer.
    // One from this values must be added in process of creation of user.
    //role field is an object that contains next private fields: viewAll; editAll; addAll; deleteAll.
    // All this values must be added in process of creation Role object and never changed again.
    //Admin - all true; viewer - only first true; customer - viewAll=true, addAll=true; main customer - viewAll=true,
    // addAll=true, editAll=true. Role object must be generated in process of creation a user depend on role type, mentioned before.
}

