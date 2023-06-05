package com.example.designpattern.creational.prototype;

import java.util.Objects;

public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Shape)) return false;

        Shape shape2 = (Shape)o;
        return shape2.x == x &&
                shape2.y == y &&
                Objects.equals(shape2.color, color);

    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}
