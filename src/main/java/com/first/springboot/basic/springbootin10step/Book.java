package com.first.springboot.basic.springbootin10step;

public class Book {
    Long id;
    String name;
    String author;

    public Book(Long book, String name, String author) {
        this.id = book;
        this.name = name;
        this.author = author;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
