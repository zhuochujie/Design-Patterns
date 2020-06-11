package com.xiaoZ.creational.prototype.clone;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("xiaoZ",new Date());
        Student s2 = (Student) s1.clone();

        s1.getBirthday().setTime(99999999999L);

        System.out.println(s1);
        System.out.println(s2);
    }
}
