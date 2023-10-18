package com.fine.datavz.mapper;

import com.fine.datavz.pojo.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface BookCommentMapper {
    List<String> findAllD();
    List<String> findAllA();
}
