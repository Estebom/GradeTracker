package GradeTracker;

import GradeTracker.Assignment;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private double courseGrade;
    private char courseGradeChar;
    private ArrayList<Assignment> assignments;


    public Course(){

    }
    public Course(String courseName, double courseGrade, char courseGradeChar){
        this.courseName = courseName;
        this.courseGrade = courseGrade;
        this.courseGradeChar = courseGradeChar;

    }
    public void addAssignment(Assignment assignment){

        assignments.add(assignment);
    }
    public void removeAssignment(int i){
        assignments.remove(i);
    }
    public String getCourseName(){

        return courseName;
    }
    public double getCourseGrade(){

        return  courseGrade;

    }
    public char getCourseGradeChar(){

        return courseGradeChar;
    }
}
