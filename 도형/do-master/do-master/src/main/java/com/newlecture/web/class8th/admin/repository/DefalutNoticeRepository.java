package com.newlecture.web.class8th.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.class8th.admin.entity.Notice;

@Repository
public class DefalutNoticeRepository implements NoticeRepository {

    @Override
    public List<Notice> findAll() {
        List<Notice> list = new ArrayList();
        
        list.add(new Notice(1,"title1","3"));
        list.add(new Notice(2,"title2","4"));
        list.add(new Notice(3,"title3","5"));
        
        return list;
    }
    
   
}
