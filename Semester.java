package org.example;

import java.util.ArrayList;

public class Semester {

    private ArrayList<Course> courses;
    private String semester;
    public Semester(String semester){

        this.semester = semester;
    }
    public void addCourse(Course course){
        courses.add(course);

    }
}
