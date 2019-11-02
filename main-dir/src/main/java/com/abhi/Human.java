package com.abhi;

import com.abhi.Animal;

class Human implements Animal{

    public int numberOfLegs() {
        return 2;
    }

    String sayHelloTo(String name) {
        return "Hello " + name;
    }

}