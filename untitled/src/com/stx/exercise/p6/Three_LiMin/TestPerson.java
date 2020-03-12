package com.stx.exercise.p6.Three_LiMin;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("张三");
        Person p2 = new Person("张三", 18);
        Person p3 = new Person("张三", 18, true);

        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());




    }
}
