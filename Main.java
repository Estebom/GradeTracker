package GradeTracker;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
private Semester semester;
private Assignment assignment;
private Course course;

    public static void main(String[] args) {

        Assignment a = new Assignment("balls", 97);
        System.out.println(a.getGrade()+a.getAssignmentName());

        Course c = new Course("math", 67, 'B');
        System.out.println(c.getCourseName() + c.getCourseGrade() + c.getCourseGradeChar());

        Course c1 = new Course();
        Course c2 = new Course("reading", 78, 'c');
        System.out.println(c1.getCourseGrade());
        c1.addAssignment(a);

        System.out.println(c1.getCourseGrade());
        //c1.removeAssignment(0);
        System.out.println(c1.getCourseGrade());

        Semester s = new Semester("spring 2025");
        s.addCourse(c1);
        s.addCourse(c);
        s.addCourse(c2);
        for(int i = 0; i < s.getSize(); i++){

            System.out.println(s.getCourse(i).toString());

        }








    }
}
