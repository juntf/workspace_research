package DP05AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null) {
            return null;
        }

        if(color.equalsIgnoreCase("RED")) {
            return new RedColor();
        }else if(color.equalsIgnoreCase("Green")) {
            return new GreenColor();
        }else {
            return new BlueColor();
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
