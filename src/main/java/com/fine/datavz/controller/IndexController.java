package com.fine.datavz.controller;

import com.alibaba.fastjson.JSON;
import com.fine.datavz.pojo.BookInfo;
import com.fine.datavz.service.BookCommentService;
import com.fine.datavz.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private BookInfoService bookInfoService;

    @Autowired
    private BookCommentService bookCommentService;

    @RequestMapping(path = "/api", produces = "application/json; charset=utf-8")
    @ResponseBody
    public List<BookInfo> getALl() {
        List<BookInfo> bookinfo = bookInfoService.findAllD();
        return bookinfo;
    }


    @RequestMapping("/")
    public String index(Model model) {
        List<String> starD = bookInfoService.getStarD();
        List<String> booknameD = bookInfoService.getBooknameD();
        List<String> timeD = new ArrayList<>();

        for (String x : bookInfoService.getPublishtimeD()) {
            try {
                timeD.add(x.substring(0, 4));
            } catch (Exception e) {
                timeD.add("");
            }
        }
        List<String> priceD = bookInfoService.getPriceD();
        List<String> pressD = bookInfoService.getPressD();
        List<String> pressA = bookInfoService.getPressA();
        List<String> starA = bookInfoService.getStarA();
        List<String> publishtimeA = bookInfoService.getPublishtimeA();
        List<String> commentD = bookCommentService.findAllD();
        List<String> commentA = bookCommentService.findAllA();

        model.addAttribute("starD", starD);
        model.addAttribute("booknameD", booknameD);
        model.addAttribute("publishtimeD", timeD);
        model.addAttribute("priceD",priceD);
        model.addAttribute("pressD",pressD);
        model.addAttribute("pressA",pressA);
        model.addAttribute("starA",starA);
        model.addAttribute("publishtimeA",publishtimeA);
        model.addAttribute("commentD",commentD);
        model.addAttribute("commentA",commentA);

        return "index";
    }

    @RequestMapping("/referer")
    public String referer() {
        return "referer";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }


}
