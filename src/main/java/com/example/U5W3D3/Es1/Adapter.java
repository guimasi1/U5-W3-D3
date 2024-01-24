package com.example.U5W3D3.Es1;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class Adapter implements DataSource{
    private final Info info;


    @Override
    public String getFullName() {
        return info.getName() + " " + info.getSurname();
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - info.getBirthday().getYear();
    }
}
