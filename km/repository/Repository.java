package com.newlecture.web.class8th.km.repository;

import com.newlecture.web.class8th.km.Data;
import com.newlecture.web.class8th.km.entity.Exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repository {

<<<<<<< HEAD
=======
    public ArrayList<Exam> getList() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:/res/data.csv");
        Scanner scan = new Scanner(fis);
        ArrayList<Data> dataList = new ArrayList<>();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] data = line.split(",");
            dataList.add(new Data(data[0], data[1]));
        }

        return dataList;
    }
>>>>>>> 151aec2fa1709fe643a02ff5d1a6a517455565e0
}
