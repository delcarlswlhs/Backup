/**
 *  This example shows the first step of creating a Rectangle class 
 * 
 * Every class has a name, attributes, and methods.
 * This first draft of the Rectangle class outlines the
 * name and attributes of the Rectangle class.
 * 
 * This file describes the attributes that every Rectangle object will have.
 * You'll see how to create objects in the next lesson.
 * 
 */

public class Rectangle
{
    
    // instance variables - the attributes of the class Rectangle
    private double width;
    private double height;
    
    //this is called the constructor
    public Rectangle(double rectWidth, double rectHeight){
        width = rectWidth;
        height = rectHeight;
    }
    
    //these are called accessors or getters
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }
    
    //this is an example of a method
    public double getArea(){
        return width * height;
    }
    
    public String toString(){
        return "The rectangle has a width of "+width+" and a height of "+height;
        
}
}