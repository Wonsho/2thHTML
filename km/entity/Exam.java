package com.newlecture.web.class8th.km.entity;

public class Exam {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Exam(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
