/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Shape {
    String color;
    boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
       public void setColor(String color) {
        this.color = color;
    }
    public boolean isFlled() {
        return filled;
    }
       public void setFilled(boolean isFlled) {
        this.filled = filled;
    }
}

