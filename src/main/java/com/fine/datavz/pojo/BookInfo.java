package com.fine.datavz.pojo;

public class BookInfo {
    private String bookname;
    private String author;
    private String star;
    private String price;
    private String press;
    private String time;

    public BookInfo(String bookname, String author, String star, String price, String press, String time) {
        this.bookname = bookname;
        this.author = author;
        this.star = star;
        this.price = price;
        this.press = press;
        this.time = time;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
