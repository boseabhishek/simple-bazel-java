package com.abhi;

import com.abhi.Animal;

public class MyMain {
    public static void main(String args[]) {
        
        Human someOne = new Human();
        System.out.println("Hey, I have " +someOne.numberOfLegs() + "legs");
        System.out.println(someOne.sayHelloTo("Mr. Pinkman"));

    }
}