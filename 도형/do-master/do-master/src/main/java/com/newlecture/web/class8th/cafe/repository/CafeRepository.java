package com.newlecture.web.class8th.cafe.repository;

import com.newlecture.web.class8th.cafe.entity.Cafe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CafeRepository {
     List<Cafe> findAll() throws FileNotFoundException;
    void findList(Cafe cafe) throws IOException;
}
