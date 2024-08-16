package com.newlecture.web.class8th.km.repository;

import com.newlecture.web.class8th.km.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repository {

    public ArrayList<Data> getList() throws FileNotFoundException {
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
}
