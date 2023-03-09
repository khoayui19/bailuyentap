/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
    class Circle extends Shape {
    private double radius;
    private final double area;
    private final double perimeter;

    public Circle(String color, boolean filled, double radius, double area, double perimeter) {
        super(color, filled);
        this.radius = radius;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getRadius() {
        return radius;
    }
     public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }

}

