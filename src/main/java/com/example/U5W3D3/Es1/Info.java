package com.example.U5W3D3.Es1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Info  {
    private String name;
    private String surname;
    private LocalDate birthday;

}
