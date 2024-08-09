package com.newlecture.web.class8th.cafe.repository;

import com.newlecture.web.class8th.cafe.entity.Cafe;
import org.springframework.stereotype.Repository;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class DefaultCafeRepository implements CafeRepository {
    @Override
    public List<Cafe> findAll() throws FileNotFoundException {

        List<Cafe> list = new ArrayList();
        FileInputStream fis = new FileInputStream("C:/res/cafe.csv");
        Scanner scan = new Scanner(fis);

        while(scan.hasNext()){
            String line = scan.nextLine();
            String [] tokens = line.split(",");
            String name = tokens[0];
            int price = Integer.parseInt(tokens[1]);
            String size = tokens[2];
            String rec = tokens[3];

            list.add(new Cafe(name,price,size,rec));
        }


        return list;
    }

    @Override
    public void findList(Cafe cafe) throws IOException {
        System.out.println("asdasds");

        File file = new File("C:/res/cafe.csv");
        FileWriter fw = new FileWriter(file,true);
        fw.append(String.format("%s,%d,%s,%s\n",cafe.getName(),cafe.getPrice(),cafe.getSize(),cafe.getRec()));

        fw.close();
    }
}
