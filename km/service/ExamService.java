package com.newlecture.web.class8th.km.service;

import com.newlecture.web.class8th.km.entity.Exam;
import com.newlecture.web.class8th.km.repository.Repository;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class ExamService {

    private Repository repository = new Repository();

    public ArrayList<Exam> findAll() throws FileNotFoundException {
        return repository.getList();
    }
}
