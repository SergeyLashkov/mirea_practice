package ru.practice.p1;

public class Ball {
    private String name;
    private int radius;
    private String color;

    public Ball (String n, int r, String c){
        name = n;
        radius = r;
        color = c;
    }
    public Ball (int r, String c){
        name = "Null";
        radius = r;
        color = c;
    }
    public Ball (int r){
        name = "Null";
        radius = r;
        color = "Null";
    }
    public Ball (){
        name = "Null";
        radius = 0;
        color = "Null";
    }
    public void setName (String name){
        this.name = name;
    }
    public void setRadius (int radius){
        this.radius = radius;
    }
    public void setColor (String color){
        this.color = color;
    }
}
