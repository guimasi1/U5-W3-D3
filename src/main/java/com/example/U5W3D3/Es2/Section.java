package com.example.U5W3D3.Es2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Section implements Page{

    List<Page> pages = new ArrayList<>();
    @Override
    public void print() {
        System.out.println("This is a book's section");
        pages.forEach(Page::print);
    }

    @Override
    public int getTotalNumberOfPages() {
        return pages.size();
    }

    public void addPage(Page page) {
        pages.add(page);
    }
}
