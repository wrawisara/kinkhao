package th.ac.ku.kinkhao.model;

import java.util.UUID;

public class Restaurant {

    private UUID id;
    private String name;
    private String address;
    private String phone;
    private int numSeats;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public UUID getId() {
        return id;
    }
//  ให้ Generate..
    //       - Getters และ Setters ทั้งหมด
}

