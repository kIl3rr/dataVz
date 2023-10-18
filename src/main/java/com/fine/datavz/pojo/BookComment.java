package com.fine.datavz.pojo;

public class BookComment {
    private String bookname;
    private String comment;

    public BookComment(String bookname, String comment) {
        this.bookname = bookname;
        this.comment = comment;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
