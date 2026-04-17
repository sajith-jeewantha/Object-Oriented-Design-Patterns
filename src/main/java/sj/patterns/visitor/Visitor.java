package sj.patterns.visitor;

import java.awt.*;

interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Square square);
}

class AreaCalculatorVisitor implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        double radius = circle.getDiameter() / 2.0;
        double result = Math.PI * radius * radius;
        System.out.println("Calculating area for circles | result : " + result);
    }

    @Override
    public void visit(Square square) {
        double result = square.getSideLength() * square.getSideLength();
        System.out.println("Calculating area for squares | result : " + result);
    }
}

interface Element {
    void accept(ShapeVisitor shapeVisitor);
}

class Circle implements Element {
    private final String name = "Circle";
    private final double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return this.name;
    }

    public double getDiameter() {
        return this.diameter;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}

class Square implements Element {
    private final String name = "Square";
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public String getName() {
        return name;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}


public class Visitor {

    public static void main(String[] args) {

        Element[] elements = new Element[]{
                new Circle(14),
                new Square(2),
        };

        ShapeVisitor shapeVisitor = new AreaCalculatorVisitor();
        for (Element element : elements) {
            element.accept(shapeVisitor);
        }
    }
}
