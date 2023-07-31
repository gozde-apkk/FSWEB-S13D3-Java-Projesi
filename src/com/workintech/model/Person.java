package com.workintech.model;

public class Person {

    //instance variable
    String firstname;
    String lastname;
    int age;
    double salary;
    boolean isMarried;
    String[] pets;

    //Constructor
    public Person(String firstname, String lastname , int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    //Constructor overloading
    public Person(String firstname, String lastname, int age, double salary, boolean isMarried, String[] pets){
      this(firstname,lastname,age);
      this.salary = salary;
      this.isMarried = isMarried;
      this.pets = pets;
    }


    //Methods


    public String getFirstName() {
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen(){
        return age >=13 && age <=19;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s, Lastname: %s," +
                "Age: %d, Salary:%f", firstname, lastname,age,salary);

    }
}
