package com.newlecture.web.class8th.exam.service;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.class8th.exam.entity.Exam;
import com.newlecture.web.class8th.exam.repository.ExamRepository;

@Service
public class DefaultExamService implements ExamService{
    
    @Autowired
    private ExamRepository repository;

    @Override
    public List<Exam> getList() throws FileNotFoundException {
        
        return repository.findAll();
    }
    
    

}
