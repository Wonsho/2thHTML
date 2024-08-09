package com.newlecture.web.class8th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServlet;

@Controller
@RequestMapping("/lecture")
public class NewtureController extends HttpServlet {

    @GetMapping("list")
    public String list() {
           return "lecture/list";
    }

    @GetMapping("detail")
    public String detail() {
           return "lecture/detail";
    }

}
