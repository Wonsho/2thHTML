package com.newlecture.web.class8th.admin.repository;

import java.util.List;

import com.newlecture.web.class8th.admin.entity.Notice;

public interface NoticeRepository {

    List<Notice> findAll();

    
} 
