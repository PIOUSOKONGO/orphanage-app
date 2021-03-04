package com.pious.orphanage_app;

public class Donateditems {

    private String Guest_name,Guest_Address,Itemone_,itemtwo,item_three;
    private int id,photo;

    public Donateditems(String guest_name, String guest_Address, String itemone_, String itemtwo, String item_three, int id, int photo) {
        Guest_name = guest_name;
        Guest_Address = guest_Address;
        Itemone_ = itemone_;
        this.itemtwo = itemtwo;
        this.item_three = item_three;
        this.id = id;
        this.photo = photo;
    }

    public String getGuest_name() {
        return Guest_name;
    }

    public void setGuest_name(String guest_name) {
        Guest_name = guest_name;
    }

    public String getGuest_Address() {
        return Guest_Address;
    }

    public void setGuest_Address(String guest_Address) {
        Guest_Address = guest_Address;
    }

    public String getItemone_() {
        return Itemone_;
    }

    public void setItemone_(String itemone_) {
        Itemone_ = itemone_;
    }

    public String getItemtwo() {
        return itemtwo;
    }

    public void setItemtwo(String itemtwo) {
        this.itemtwo = itemtwo;
    }

    public String getItem_three() {
        return item_three;
    }

    public void setItem_three(String item_three) {
        this.item_three = item_three;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
