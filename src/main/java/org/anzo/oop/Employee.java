package org.anzo.oop;


public class Employee {


    String name ;
    String address;
    String Email;
    int age;
    int id  = (int )(Math.random()* 999);

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;

    }



    public void setEmail(String email) {
        Email = email;
    }
}
