package com.pious.orphanage_app;

public class Person {
    private  String Name,Email,Address,Program;
    private int photo,id;




    public Person(String name, String email, String address, String program, int photo,int id) {
        Name = name;
        Email = email;
        Address = address;
        Program = program;
        this.photo = photo;
        this.id= id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        Program = program;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
