package org.efrei.start.dto;

public class CreatePremiumUser {
    private String firstName;
    private String lastName;
    private String age;


    public String getFirstName() {
        return this.firstName;
    }
    public void setTitle(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setCategory(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}
