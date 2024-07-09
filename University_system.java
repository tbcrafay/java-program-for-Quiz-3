/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*The university needs a system to manage student enrollments, course offerings, and faculty 
assignments. The system should allow students to enroll in courses, faculty to manage courses, and 
administrators to oversee the entire system. This case study demonstrates the use of encapsulation, 
inheritance, and polymorphism to build a flexible and maintainable university system..*/
package Assignment_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abdul Rafay
 */
class Person {

    private String name;
    private String ID;

    public  Person(String name, String ID) {

        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", ID=" + ID + '}';
    }

}

class Student extends Person {

    private String major;
    private List<Course> enrolledCourses;

    public  Student(String name, String ID, String major) {
        super(name, ID);
        this.major = major;
        this.enrolledCourses = new ArrayList<>();

    }

    public void enrolledCourses(Course course) {

        enrolledCourses.add(course);
    }
}

class Faculty extends Person {

    private String department;
    private List<Course> coursetaught;

    public  Faculty(String name, String ID, String department) {

        super(name, ID);
        this.department = department;
        this.coursetaught = new ArrayList<>();
    }

    public void addCourses(Course course) {

        coursetaught.add(course);
        System.out.println("Assigned course: " + course.getName() + " to " + this.getName());
    }

    public void remove(Course course) {

        coursetaught.remove(course);
        System.out.println("Removed course: " + course.getName() + " from " + this.getName());
    }
}



class Administrator extends Person {

    private List<Student> students;
    private List<Faculty> faculty;
    private List<Course> courses;

    public Administrator(String name, String id) {
        super(name, id);
        this.students = new ArrayList<>();
        this.faculty = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Functionalities for managing students, faculty, and courses (adding, removing, viewing)

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student: " + student.getName());
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("Removed student: " + student.getName());
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Displaying all students:");
            for (Student student : students) {
                System.out.println(student); // Assuming Student has a meaningful toString() method
            }
        }
    }

    public void addFaculty(Faculty faculty) {
        this.faculty.add(faculty);
        System.out.println("Added faculty member: " + faculty.getName());
    }

    public void removeFaculty(Faculty faculty) {
        this.faculty.remove(faculty);
        System.out.println("Removed faculty member: " + faculty.getName());
    }

    public void viewFaculty() {
        if (faculty.isEmpty()) {
            System.out.println("No faculty members found.");
        } else {
            System.out.println("Displaying all faculty members:");
            for (Faculty facultyMember : faculty) {
                System.out.println(facultyMember); // Assuming Faculty has a meaningful toString() method
            }
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Added course: " + course.getName());
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        System.out.println("Removed course: " + course.getName());
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            System.out.println("Displaying all courses:");
            for (Course course : courses) {
                System.out.println(course); // Assuming Course has a meaningful toString() method
            }
        }
    }

    
    public void viewCourseDetails(Course course) {
        // Implement logic to display detailed course information for administrators
        System.out.println("Course Details:");
        System.out.println("Name: " + course.getName());
        System.out.println("Code: " + course.getCode());
        System.out.println("Instructor: " + course.getInstructor().getName()); // Assuming getter for instructor
        System.out.println("Enrolled Students:");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}





class Course {

    private String name;
    private String code;
    private Faculty instructor;
    private List<Student> enrolledStudents;

    public Course(String name, String code, Faculty instructor) {
        this.name = name;
        this.code = code;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }
    
//    public abstract void viewCourseDetails(); // Polymorphic method (implemented in subclasses)

    // Getter methods for name, code, instructor, and enrolledStudents (omitted for brevity)

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    
}

public class University_system {

        public static void main(String[] args) {
        // Create some students and faculty
        Student student1 = new Student("John Doe", "12345", "Computer Science");
        Faculty faculty1 = new Faculty("Jane Smith", "54321", "Computer Science");

        // Create a course and assign instructor
        Course course1 = new Course("Introduction to Programming", "CS101", faculty1);

        // Student enrolls in the course
        student1.enrolledCourses(course1);

        // Administrator can view information
        Administrator admin = new Administrator("Alice Jones", "123434");
        System.out.println(student1.getName() + " is enrolled in " + course1.getName());
        admin.viewCourseDetails(course1); // Polymorphic call based on administrator role
    }
}
