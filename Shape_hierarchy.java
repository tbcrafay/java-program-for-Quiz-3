/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beginner_level;

/**
 *
 * @author Abdul Rafay
 */

abstract class Shape{

    abstract void calculate_area();
}

class Circle extends Shape{
     
    float radius;
    
    public void calculate_area(){
    
        this.radius = radius;
        float area = (float) (3.142 * (radius*2));
        System.out.println("Area of the circle: " + area);
        
    }
}


public class Shape_hierarchy {
    
    public static void main(String[] args){
    
        Circle circle = new Circle();
        circle.radius = 2;
        circle.calculate_area();
    }
}
