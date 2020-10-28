package DP02SingletonPattern;

public class SingletonBase {

    private static SingletonBase instance = new SingletonBase();

    private SingletonBase() {}

    public static SingletonBase getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello Singleton!");
    }
}
