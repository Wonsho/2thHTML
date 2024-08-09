package com.newlecture.web.class8th.exam.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.class8th.exam.entity.Exam;
import com.newlecture.web.class8th.exam.repository.ExamRepository;
import com.newlecture.web.class8th.exam.service.ExamService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/exam/detail")
public class ExamController {
    
   @Autowired
   private ExamService service;

   @GetMapping("list")
   public void list(HttpServletResponse response) throws FileNotFoundException{
    
    for(int i = 0; i<service.getList().size();i++){
        System.out.println(service.getList().get(i));
    }
    
   }
   
   

}
