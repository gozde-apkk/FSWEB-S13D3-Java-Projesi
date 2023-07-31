package com.workintech.model;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        person.pets = new String[2];
        person.pets[0]= "cat";
        person.pets[1] = "dog";
        System.out.println(Arrays.toString(person.pets));
        System.out.println(person);
       person.salary=20000;
        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());


        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());System.out.println("area= " + wall.getArea());

    }



}








