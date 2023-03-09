/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
class Rectangle extends Shape {
    private double width;
    private double length;
    private final double area;
    private final double perimeter;

    public Rectangle(String color, boolean filled, double width, double length, double area, double perimeter) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getWidth() {
        return width;
    }
     public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }

}

