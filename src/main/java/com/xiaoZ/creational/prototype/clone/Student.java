package com.xiaoZ.creational.prototype.clone;

import java.util.Date;

public class Student implements Cloneable {
    private String name;
    private Date birthday;

    public Student() {
    }

    public Student(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        //深克隆
        Date birthday = (Date) s.getBirthday().clone();
        s.setBirthday(birthday);
        return s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
