/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beginner_level;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abdul Rafay
 */
class Student{

    private String name;
    private int ID;
    
    public Student(String name, int ID){
        
        this.name = name;
        this.ID=ID;
        
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
    
}

public class Student_Names {
    
    public static void main(String[] args){
    
        List<Student> students = new ArrayList<>();
        
        Student studdent1 = new Student("Arham",1);
        students.add(studdent1);
        
        for(Student student : students){
        
            System.out.println("the name of Student 1: " + student.getName() + " and their ID: " + student.getID());
            
        }
    }
    
}
