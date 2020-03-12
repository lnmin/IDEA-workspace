package com.stx.exercise.p6.Three_LiMin;

public class Person {
    private String name;
    private int age;
    private boolean sex;

    public Person() {

    }
    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    public Person(String name, int age, boolean sex){
        this(name,age);
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
