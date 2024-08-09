package com.newlecture.web.class8th.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.newlecture.web.class8th.admin.entity.Notice;
import jakarta.servlet.ServletOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.class8th.admin.service.NoticeService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/admin/notice")
public class NoticeController {

    @Autowired
    private NoticeService service;

    @GetMapping("list")
//    @ResponseBody
    public String list(
//            HttpServletResponse response
            @RequestParam(name = "p", defaultValue = "1") Integer page,
            Model model) {
        int offset = page + 1;
        System.out.println(offset);
        List<Notice> notices = service.getList();
        model.addAttribute("notices", notices);
        model.addAttribute("test", "Hello");


//        return service.getList();
        return "admin/notice/list";
    }


}
