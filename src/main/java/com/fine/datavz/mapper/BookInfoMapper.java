package com.fine.datavz.mapper;

import com.fine.datavz.pojo.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookInfoMapper {
    List<BookInfo> findAllD();

    List<String> getStarD();
    List<String> getPublishtimeD();
    List<String> getBooknameD();
    List<String> getPriceD();
    List<String> getPressD();

    List<BookInfo> findAllA();
    List<String> getStarA();
    List<String> getPublishtimeA();
    List<String> getBooknameA();
    List<String> getPressA();

}
