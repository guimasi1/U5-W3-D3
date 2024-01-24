package com.example.U5W3D3.Es3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner3 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Person person = new Person("Tenente",1000.0);
        RoleFilter rolefilter=  new RoleFilter();
        rolefilter.check(person);
    }
}
