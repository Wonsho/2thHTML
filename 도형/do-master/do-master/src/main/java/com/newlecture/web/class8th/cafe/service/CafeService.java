package com.newlecture.web.class8th.cafe.service;

import com.newlecture.web.class8th.cafe.entity.Cafe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CafeService {
     List<Cafe> getList() throws FileNotFoundException;
     void addList(Cafe cafe) throws IOException;
}
