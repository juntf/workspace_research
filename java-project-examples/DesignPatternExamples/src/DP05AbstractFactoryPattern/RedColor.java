package DP05AbstractFactoryPattern;

public class RedColor implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
