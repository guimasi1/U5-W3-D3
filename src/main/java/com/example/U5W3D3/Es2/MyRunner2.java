package com.example.U5W3D3.Es2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Author author1 = new Author("Franco Maglio");
        Author author2 = new Author("Luca Giurato");
        Book book = new Book("Ma che bel castello");

        book.addAuthor(author1);
        book.addAuthor(author2);
        Section section = new Section();
        Section section2 = new Section();
        Page page = new OnePage();
        Page page2 = new OnePage();
        Page page3 = new OnePage();
        Page page4 = new OnePage();
        Page page5 = new OnePage();
        Page page6 = new OnePage();
        Page page7 = new OnePage();
        Page page8 = new OnePage();
        Page page9 = new OnePage();
        section2.addPage(page5);
        section2.addPage(page6);
        section2.addPage(page7);
        section2.addPage(page8);
        section2.addPage(page9);
        section.addPage(page);
        section.addPage(page2);
        section.addPage(page3);
        section.addPage(page4);
        book.addPage(section);
        book.addPage(section2);
   /*     System.out.println("Book's total pages: " + book.getTotalNumberOfPages());
        System.out.println("First Section's total pages : " + section.getTotalNumberOfPages());
        System.out.println("Second Section's total pages: " + section2.getTotalNumberOfPages());
        book.print();*/
    }


}
