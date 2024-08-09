package com.newlecture.web.class8th.cafe.entity;

public class Cafe {
    private String name;
    private int price;
    private String size;
    private String rec;

    public Cafe(String name, int price, String size, String rec) {
        this.rec = rec;
        this.size = size;
        this.price = price;
        this.name = name;
    }
    public Cafe(){

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", rec='" + rec + '\'' +
                '}';
    }
}
