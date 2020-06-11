package com.xiaoZ.creational.builder.v1;

public class Main {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(builder);

        Course course = coach.makeCourse(
                "Java设计模式",
                "Java设计模式ppt",
                "Java设计模式视频",
                "Java设计模式文章",
                "Java设计模式问答"
        );
        System.out.println(course);
    }
}
