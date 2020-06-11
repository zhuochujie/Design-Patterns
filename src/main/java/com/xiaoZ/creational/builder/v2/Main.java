package com.xiaoZ.creational.builder.v2;

public class Main {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseName("Java设计模式")
                .builderCoursePPT("Java设计模式PPT")
                .builderCourseVideo("Java设计模式视频")
                .builderCourseArticle("Java设计模式文章")
                .builderCourseQA("Java设计模式问答")
                .build();

        System.out.println(course);
    }
}
