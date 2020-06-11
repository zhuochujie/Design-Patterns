package com.xiaoZ.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(String type){
        if ("Java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }else if ("Python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    public Video getVideo(Class c){
        Object o = null;
        try {
            o = Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (o instanceof Video){
            return (Video)o;
        }
        throw new RuntimeException("The arg must be type Video.class");
    }
}
