package com.fine.datavz.service;

import com.fine.datavz.mapper.BookCommentMapper;
import com.fine.datavz.pojo.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCommentService {
    @Autowired
    private BookCommentMapper bookCommentMapper;

    public List<String> findAllD(){
        return bookCommentMapper.findAllD();
    }
    public List<String> findAllA(){
        return bookCommentMapper.findAllA();
    }
}
