package Model;

public class Guest_item_Donated {

    int id;
    String Guest_Name,Guest_Address,ItemOne,ItemTwo,ItemTHREE;

    public Guest_item_Donated(int id, String guest_Name, String guest_Address, String itemOne, String itemTwo, String itemTHREE) {
        this.id = id;
        Guest_Name = guest_Name;
        Guest_Address = guest_Address;
        ItemOne = itemOne;
        ItemTwo = itemTwo;
        ItemTHREE = itemTHREE;
    }
    public Guest_item_Donated(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuest_Name() {
        return Guest_Name;
    }

    public void setGuest_Name(String guest_Name) {
        Guest_Name = guest_Name;
    }

    public String getGuest_Address() {
        return Guest_Address;
    }

    public void setGuest_Address(String guest_Address) {
        Guest_Address = guest_Address;
    }

    public String getItemOne() {
        return ItemOne;
    }

    public void setItemOne(String itemOne) {
        ItemOne = itemOne;
    }

    public String getItemTwo() {
        return ItemTwo;
    }

    public void setItemTwo(String itemTwo) {
        ItemTwo = itemTwo;
    }

    public String getItemTHREE() {
        return ItemTHREE;
    }

    public void setItemTHREE(String itemTHREE) {
        ItemTHREE = itemTHREE;
    }
}
