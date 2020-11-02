package DP05AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choise) {
        if(choise.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if(choise.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
