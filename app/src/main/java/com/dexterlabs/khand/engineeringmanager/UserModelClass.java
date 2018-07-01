package com.dexterlabs.khand.engineeringmanager;

public class UserModelClass {

    String id,phoneNum,emailAddress;

    public UserModelClass(String id, String phoneNum, String emailAddress) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
