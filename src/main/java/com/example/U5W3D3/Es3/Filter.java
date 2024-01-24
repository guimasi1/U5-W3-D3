package com.example.U5W3D3.Es3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Filter {
    private Filter nextFilter;
    public abstract void check(Person person);
    public void next(Person person) {
        if(this.nextFilter != null) this.nextFilter.check(person);
        System.out.println("Fine della catena");
    }
}
