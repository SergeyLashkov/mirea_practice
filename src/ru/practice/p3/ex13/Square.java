package ru.practice.p3.ex13;

public class Square extends Rectangle {

    public Square() { }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square Area = " + this.getArea() + "Square Perimeter = " + this.getPerimeter();
    }
}