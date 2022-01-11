package com.codegym;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red", false);
        System.out.println(shape1);

        Circle circle = new Circle();
        System.out.println(circle);


        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 4.5);
        System.out.println(rectangle);
        rectangle = new Rectangle("black", true, 3.5, 5.2);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8,"yellow",false);
        System.out.println(square);
    }

}
