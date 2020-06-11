package com.xiaoZ.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        CourseFactory factory = new PythonCourseFactory();
        Article article = factory.getArticle();
        Video video = factory.getVideo();
        article.produce();
        video.produce();
    }
}
