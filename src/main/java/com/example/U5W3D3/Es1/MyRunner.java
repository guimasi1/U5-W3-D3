package com.example.U5W3D3.Es1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        UserData userData = new UserData();
        Info info = new Info("Franco","Maglio", LocalDate.of(1994,10,10));
        Adapter adapter = new Adapter(info);
        userData.getData(adapter);
        System.out.println("Fullname: " + adapter.getFullName() + ", age: " + adapter.getAge());
    }
}
