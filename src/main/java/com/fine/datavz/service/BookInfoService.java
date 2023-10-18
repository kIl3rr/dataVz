package com.fine.datavz.service;

import com.fine.datavz.mapper.BookInfoMapper;
import com.fine.datavz.pojo.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInfoService {
    @Autowired
    private BookInfoMapper bookInfoMapper;
    public List<BookInfo> findAllD(){
        return bookInfoMapper.findAllD();
    }
    public List<String> getStarD(){
        return bookInfoMapper.getStarD();
    }
    public List<String> getPublishtimeD(){
        return bookInfoMapper.getPublishtimeD();
    }

    public List<String> getBooknameD(){
        return bookInfoMapper.getBooknameD();
    }

    public List<String> getPressD(){
        return bookInfoMapper.getPressD();
    }
    public List<String> getPriceD(){
        return bookInfoMapper.getPriceD();
    }
    public List<BookInfo> findAllA(){
        return bookInfoMapper.findAllA();
    }
    public List<String> getStarA(){
        return bookInfoMapper.getStarA();
    }
    public List<String> getPublishtimeA(){
        return bookInfoMapper.getPublishtimeA();
    }

    public List<String> getBooknameA(){
        return bookInfoMapper.getBooknameA();
    }

    public List<String> getPressA(){
        return bookInfoMapper.getPressA();
    }



}
