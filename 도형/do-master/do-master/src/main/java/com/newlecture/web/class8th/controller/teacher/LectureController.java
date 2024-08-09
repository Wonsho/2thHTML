package com.newlecture.web.class8th.controller.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServlet;

@Controller("teacherLectureController")
@RequestMapping("/teacher/lecture")
public class LectureController extends HttpServlet {

    @GetMapping("detail")
    public String detail() {
           return "teacher/lecture/detail";
    }

    
    @GetMapping("list")
    public String list() {
           return "teacher/lecture/list";
    }
}
