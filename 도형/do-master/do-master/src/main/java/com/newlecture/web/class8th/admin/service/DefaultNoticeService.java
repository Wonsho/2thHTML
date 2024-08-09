package com.newlecture.web.class8th.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.class8th.admin.entity.Notice;
import com.newlecture.web.class8th.admin.repository.NoticeRepository;

import java.util.List;

@Service
public class DefaultNoticeService implements NoticeService {
    
    @Autowired
    private NoticeRepository repository;
    

    @Override
    public List<Notice> getList(){
        return repository.findAll();
    }
}
