package com.course.syntax;

import javax.management.relation.Role;

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
}

