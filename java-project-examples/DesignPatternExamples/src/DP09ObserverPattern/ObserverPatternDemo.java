package DP09ObserverPattern;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 100");
        subject.setState(100);

        System.out.println("----------------------------");

        System.out.println("Second state change: 200");
        subject.setState(200);
    }
}
