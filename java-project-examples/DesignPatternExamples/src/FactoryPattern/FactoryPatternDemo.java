package FactoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        // ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();


        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();


        System.out.println("===========================");
        System.out.println("===========================");

        // Burger Factory;
        BurgerFactory burgerFactory = new BurgerFactory();

        Burger burger1 = burgerFactory.getBurger("MCDONALS");
        burger1.eat();


        Burger burger2 = burgerFactory.getBurger("LOTTERIA");
        burger2.eat();

        Burger burger3 = burgerFactory.getBurger("KFC");
        burger3.eat();

    }
}
