package com.newlecture.web.class8th.exam.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.newlecture.web.class8th.exam.entity.Exam;

public interface ExamService {

    public List<Exam> getList() throws FileNotFoundException;
        
    
} 
