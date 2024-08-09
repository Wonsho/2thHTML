package com.newlecture.web.class8th.exam.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

import com.newlecture.web.class8th.exam.entity.Exam;

@Repository
public class DefaultExamRepository implements ExamRepository {

    @Override
    public List<Exam> findAll() throws FileNotFoundException {
       FileInputStream fis = new FileInputStream("C:/res/data1.csv");
       Scanner scan = new Scanner(fis);

       List<Exam>list = new ArrayList<>();

       scan.nextLine();
       while(scan.hasNextLine()){
        String line = scan.nextLine();
        String tokens[] = line.split(",");
        String name = tokens[0];
        int kor = Integer.parseInt(tokens[1]);
        int eng = Integer.parseInt(tokens[2]);
        int math = Integer.parseInt(tokens[3]);

        list.add(new Exam(name,kor,eng,math));
       }
       return list;
    }
    
}
