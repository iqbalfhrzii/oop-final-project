package Java.Tugas2;

import java.util.ArrayList;

public class Student extends Person {

    protected int numCourses;
    protected ArrayList<String> courses;
    protected ArrayList<Integer> grades;


    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
        numCourses++;
    }

    public void printGrades() {
        System.out.println("Grades:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
        System.out.println();
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades.get(i);
        }
        return (double) sum / numCourses;
    }

    // gunakan override method "toString" dari superclass Person 
    @Override
    public String toString() {
        return "Student{" + ",\n" +
                "   name='" + name + ",\n" +
                "   address='" + address + ",\n" +
                "   numCourses=" + numCourses + ",\n" +
                "   courses=" + courses + ",\n" +
                "   grades=" + grades + ",\n" +
                '}';
    }
}
