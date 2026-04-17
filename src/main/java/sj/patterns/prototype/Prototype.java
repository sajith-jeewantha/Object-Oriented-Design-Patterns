package sj.patterns.prototype;

interface Shape {
    Shape clone();

    void draw();
}

class Circle implements Shape {

    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + this.getClass().getSimpleName() + " with color: " + color + " - " + this.hashCode());
    }
}

class Rectangle implements Shape {
    private final String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + this.getClass().getSimpleName() + " with color: " + color + " - " + this.hashCode());
    }
}

class ShapeCreator {
    private final Shape shape;

    public ShapeCreator(Shape shape) {
        this.shape = shape;
    }

    public Shape createShape() {
        return shape.clone();
    }
}


public class Prototype {
    public static void main(String[] args) {

        Shape circle = new Circle("red");
        Shape rectangle = new Rectangle("blue");

        ShapeCreator creator = new ShapeCreator(circle);
        creator.createShape().draw();
        creator.createShape().draw();
        creator.createShape().draw();

        ShapeCreator creator2 = new ShapeCreator(rectangle);
        creator2.createShape().draw();
        creator2.createShape().draw();
        creator2.createShape().draw();

    }
}
