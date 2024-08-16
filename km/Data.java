package com.newlecture.web.class8th.km;

public class Data {
    private String n1;
    private String n2;

    public Data(String n1, String n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Data{" +
                "n1='" + n1 + '\'' +
                ", n2='" + n2 + '\'' +
                '}';
    }
}
