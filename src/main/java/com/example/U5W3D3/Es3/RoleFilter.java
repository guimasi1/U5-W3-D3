package com.example.U5W3D3.Es3;

public class RoleFilter extends Filter{
    @Override
    public void check(Person person) {
        if(person.getSalary() >= 1000.0) {
            System.out.println("ruolo " + person.getRole() + ", stipendio: " + person.getSalary());
        } else {
            System.out.println("Minore di 1000");
        }
    }
}
