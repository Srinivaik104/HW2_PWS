package com.services.BottomUp;

public class Flight {
    private String depCity;
    private String destCity;
    private String date;
    private int price;

    public Flight(String depCity, String destCity, String date, int price){
        this.depCity = depCity;
        this.destCity = destCity;
        this.date = date;
        this.price = price;
    }
    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}