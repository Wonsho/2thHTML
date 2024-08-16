package com.newlecture.web.class8th.km.controller;

import com.newlecture.web.class8th.km.Data;
import com.newlecture.web.class8th.km.service.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {

    private Service service = new Service();

    public void getUrl() throws FileNotFoundException {
        ArrayList<Data> datas = service.getList();

        for (Data data : datas) {
            System.out.println(data.toString());
        }
    }
}
