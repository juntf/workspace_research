package FactoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();


        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
