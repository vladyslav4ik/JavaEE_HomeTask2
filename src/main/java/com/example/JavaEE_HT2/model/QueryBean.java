package com.example.JavaEE_HT2.model;

public class QueryBean {
    private String region;
    private int area;
    private int noRooms;
    private float price;

    public QueryBean() {
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNoRooms() {
        return noRooms;
    }

    public void setNoRooms(int noRooms) {
        this.noRooms = noRooms;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "QueryBean{" +
                "region='" + region + '\'' +
                ", area=" + area +
                ", noRooms=" + noRooms +
                ", price=" + price +
                '}';
    }
}