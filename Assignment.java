package org.example;

public class Assignment {

    private String assignmentName;
    private double grade;
    public Assignment(String assignmentName, double grade){

        this.assignmentName =  assignmentName;
        this.grade = grade;

    }

    public String getAssignmentName(){

        String assignmentName1 = assignmentName;
        return assignmentName1;
    }

    public double getGrade(){

        double grad1 = grade;
        return grade;
    }
    public void setAssignmentName(String assignmentName){

        this.assignmentName = assignmentName;

    }
    public void setGrade(double grade){

        this.grade = grade;
    }
}
