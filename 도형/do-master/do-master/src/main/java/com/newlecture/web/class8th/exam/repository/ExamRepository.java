package com.newlecture.web.class8th.exam.repository;

import java.io.FileNotFoundException;
import java.util.List;

import com.newlecture.web.class8th.exam.entity.Exam;

public interface ExamRepository {

    List<Exam> findAll() throws FileNotFoundException;

    
}
