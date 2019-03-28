package com.ttn.thymeleaf.SpringThymeleaf.enums;

public enum Users {
    User("This is user"),
    Admin("This is admin"),
    Super_Admin("This is super admin");
    String value;
    Users(String users){
        value=users;
    }

    public String getValue(){
        return value;
    }
}
