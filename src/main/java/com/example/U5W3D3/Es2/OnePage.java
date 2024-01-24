package com.example.U5W3D3.Es2;

import lombok.Getter;

@Getter
public class OnePage implements Page{
    int numberOfPages = 1;
    @Override
    public void print() {
        System.out.println("This is a page");
    }

    @Override
    public int getTotalNumberOfPages() {
        return 1;
    }
}
