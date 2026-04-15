package Parte_b.clasesejercicio1anteriores;

/**
 * The Rectangle class models a Rectangle with a length and color.
 */
public class Rectangle { // Save as "Rectangle.java"
    // private instance variable, not accessible from outside this class
    private double length;
    private double width;


    // Constructors (overloaded)
    /** Constructs a Rectangle instance with default value for length and color */
    public Rectangle() { // 1st (default) constructor
        length = 1.0f;
        width = 1.0f;
    }
    /** Returns the length */
    public double getLength() {
        return length;
    }
    public double getWidth(){
        return width;
    }

    /** Returns the area of this Rectangle instance */
    public double getArea() {
        return length*width;
    }
    /** Returns the area of this Rectangle instance */
    public Rectangle (double l, double w) {
        length=l;
        width=w;
    }
    // Setter for instance variable length
    public void setLength(double newLength) {
        length = newLength;
    }
    public void setWidth(double setWidth) { width = setWidth;}
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
    public  double getPerimeter(){
        return 2*length+2*width;
    }
}
