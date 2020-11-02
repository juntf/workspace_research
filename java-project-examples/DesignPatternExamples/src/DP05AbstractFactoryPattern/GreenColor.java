package DP05AbstractFactoryPattern;

public class GreenColor implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
