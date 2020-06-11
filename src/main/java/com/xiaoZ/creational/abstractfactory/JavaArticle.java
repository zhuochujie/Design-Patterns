package com.xiaoZ.creational.abstractfactory;

public class JavaArticle implements Article {
    @Override
    public void produce() {
        System.out.println("Java手记");
    }
}
