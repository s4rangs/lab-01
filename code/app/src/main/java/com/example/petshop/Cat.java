package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable{ // extends Pet is saying Cat is subclass of pet so Cat has everything Pet does
    public Cat(String name) {
        super(name);
    }
    public Cat(String name, Date birthDate) {
        super(name, birthDate); // will correctly map and call to constructor
    }
    @Override
    public String speak() {
        return "meow"; // Cats meow
    }

    @Override
    public Void pet() {
        return null;
    }



}
