package com.example.U5W3D3.Es2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Page{


    String title;
    List<Page> pages = new ArrayList<>();
    List<Author> authors = new ArrayList<>();
    double price;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(this.title);
        System.out.println();
        authors.forEach(System.out::println);
        pages.forEach(Page::print);
    }

    @Override
    public int getTotalNumberOfPages() {
        return pages.stream().mapToInt(Page::getTotalNumberOfPages).sum();
    }
    public void addAuthor(Author author) {
        authors.add(author);
    }
    public void addPage(Page page) {
        pages.add(page);
    }
}
