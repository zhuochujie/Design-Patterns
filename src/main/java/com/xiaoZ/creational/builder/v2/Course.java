package com.xiaoZ.creational.builder.v2;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course(CourseBuilder builder) {
        this.courseName = builder.courseName;
        this.coursePPT = builder.coursePPT;
        this.courseVideo = builder.courseVideo;
        this.courseArticle = builder.courseArticle;
        this.courseQA = builder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder builderCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }
        public CourseBuilder builderCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuilder builderCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder builderCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBuilder builderCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
