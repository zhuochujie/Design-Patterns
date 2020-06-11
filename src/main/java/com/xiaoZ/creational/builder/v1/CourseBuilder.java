package com.xiaoZ.creational.builder.v1;

/**
 * 课程建造者接口
 */
public interface CourseBuilder {
    void buildCourseName(String courseName);
    void buildCoursePPT(String coursePPT);
    void buildCourseVideo(String courseVideo);
    void buildCourseArticle(String courseArticle);
    void buildCourseQA(String courseQA);

    Course makeCourse();
}
