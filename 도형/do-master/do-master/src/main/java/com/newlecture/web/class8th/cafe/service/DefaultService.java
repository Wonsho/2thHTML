package com.newlecture.web.class8th.cafe.service;

import com.newlecture.web.class8th.cafe.entity.Cafe;
import com.newlecture.web.class8th.cafe.repository.CafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Service
public class DefaultService implements CafeService {
    @Autowired
    private CafeRepository repository;

    @Override
    public List<Cafe> getList() throws FileNotFoundException {
        return repository.findAll();
    }

    @Override
    public void addList(Cafe cafe) throws IOException {
        repository.findList(cafe);

    }
}
