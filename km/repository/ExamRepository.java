package com.newlecture.web.class8th.km.repository;

import com.newlecture.web.class8th.km.entity.Exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamRepository {
    ArrayList<Exam> findAll() throws FileNotFoundException {
        ArrayList<Exam> getlist = new ArrayList<>();
        FileInputStream fis = new FileInputStream("c:res/exam.csv");
        Scanner scan = new Scanner(fis);
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] tokens = line.split(",");
            String name = tokens[0];
            int kor = Integer.parseInt(tokens[1]);
            int eng = Integer.parseInt(tokens[2]);
            int math = Integer.parseInt(tokens[3]);

            getlist.add(new Exam(name, kor, eng, math));
        }
        return getlist;

    }
}
