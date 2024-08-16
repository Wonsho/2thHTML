package com.newlecture.web.class8th.km.service;

import com.newlecture.web.class8th.km.Data;
import com.newlecture.web.class8th.km.repository.Repository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Service {

    private Repository repository = new Repository();

    public ArrayList<Data> getList() throws FileNotFoundException {
        return repository.getList();
    }
}
