package com.xiaoZ.creational.abstractfactory;

public class PythonArticle extends PythonCourseFactory implements Article {
    @Override
    public void produce() {
        System.out.println("Python手记");
    }
}
