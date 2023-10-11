package GradeTracker;

import GradeTracker.Course;

import java.util.ArrayList;

public class Semester {

    private ArrayList<Course> courses = new ArrayList<>();
    private String semesterName;
    public Semester(String semesterName){

        this.semesterName = semesterName;
    }
    public void addCourse(Course course){
        courses.add(course);

    }
    public Course getCourse(int i){

        return courses.get(i);
    }
    public int getSize(){

        return courses.size();
    }
}
