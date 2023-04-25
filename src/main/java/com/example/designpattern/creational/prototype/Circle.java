package com.example.designpattern.creational.prototype;

public class Circle extends Shape{
    public int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Circle) || !super.equals(object)) return false;

        Circle circle2 = (Circle) object;
        return circle2.radius == this.radius;

    }
}
