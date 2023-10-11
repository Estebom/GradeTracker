package GradeTracker;

import GradeTracker.Assignment;

import java.util.ArrayList;

public class Course {
    private CourseCalculator calc = new CourseCalculator();
    private String courseName;
    private double courseGrade;
    private char courseGradeChar;
    private ArrayList<Assignment> assignments;


    public Course(){

            this.assignments = new ArrayList<>();

    }
    public Course(String courseName, double courseGrade, char courseGradeChar){
        this.courseName = courseName;
        this.courseGrade = courseGrade;
        this.courseGradeChar = courseGradeChar;
        this.assignments = new ArrayList<>();


    }
    public Course(ArrayList<Assignment> assignments){
        for(int i = 0; i < assignments.size(); i++){

            this.assignments.add(i, assignments.get(i));

        }

    }

    public void addAssignment(Assignment assignment){

        this.assignments.add(assignment);
        this.courseGrade = calc.calculateAvg(assignments);
    }
    public void removeAssignment(int i){
        this.assignments.remove(i);
        this.courseGrade = calc.calculateAvg(assignments);
    }
    public String getCourseName(){

        return courseName;
    }
    public double getCourseGrade(){

        return courseGrade;

    }
    public char getCourseGradeChar(){

        return courseGradeChar;
    }
    @Override
    public String toString() {
        return "Course Name: " + courseName +
                ", Course Grade: " + courseGrade +
                ", Grade Character: " + courseGradeChar;
    }
}
