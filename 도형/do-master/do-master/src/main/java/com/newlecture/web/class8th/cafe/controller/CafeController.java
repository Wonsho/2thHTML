package com.newlecture.web.class8th.cafe.controller;

import com.newlecture.web.class8th.cafe.entity.Cafe;
import com.newlecture.web.class8th.cafe.service.CafeService;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cafe")
public class CafeController {

    @Autowired
    private CafeService service;

      @GetMapping("list")
      public String list() throws FileNotFoundException {
          List<Cafe> list = service.getList();

          return "cafe/list";
      }

      @GetMapping("admin")
      public String Admin() throws IOException {


        return "cafe/admin";
      }

      @PostMapping("admin")
        public String add(HttpServlet
                          ) throws IOException {

          return "redirect:/cafe/admin";
      }

}
