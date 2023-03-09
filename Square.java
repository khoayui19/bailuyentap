/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
class Square extends Rectangle{
    private final double width;
    private final double length;
    private double side;

    public Square( double width, double length, double side) {
        super(width, length);
        this.width = width;
        this.length = length;
        this.side = side;
    }
        public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return width;
    }
    @Override
    public double getLength() {
        return length;
    }
}
