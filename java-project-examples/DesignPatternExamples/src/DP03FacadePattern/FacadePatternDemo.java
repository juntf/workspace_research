package DP03FacadePattern;

public class FacadePatternDemo {

    /**
     * https://www.runoob.com/design-pattern/facade-pattern.html
     * @param args
     */
    public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawSquare();
    }
}
