package com.xiaoZ.structural.composite;

public class Main {
    public static void main(String[] args) {
        CatalogComponent javaCourse = new Course("Java课程",399);
        CatalogComponent pythonCourse = new Course("python课程",299);

        CatalogComponent programLanguageCatalog = new CourseCatalog("编程语言目录");

        programLanguageCatalog.add(javaCourse);
        programLanguageCatalog.add(pythonCourse);

        CatalogComponent UICourse = new Course("UI课程",399);
        CatalogComponent UECourse = new Course("UE课程",299);

        CatalogComponent designCatalog = new CourseCatalog("设计目录");

        designCatalog.add(UICourse);
        designCatalog.add(UECourse);

        CatalogComponent allCatalog = new CourseCatalog("总目录");

        allCatalog.add(programLanguageCatalog);
        allCatalog.add(designCatalog);

        CatalogComponent test = new Course("test",100);
        CatalogComponent testCatalog = new CourseCatalog("test目录");
        testCatalog.add(test);

        designCatalog.add(testCatalog);

        allCatalog.print();
    }
}
