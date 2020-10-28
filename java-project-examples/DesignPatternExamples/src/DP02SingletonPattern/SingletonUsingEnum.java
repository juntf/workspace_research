package DP02SingletonPattern;

public enum SingletonUsingEnum {

    INSTANCE;
    public void showMessage() {
        System.out.println("Singleton Enum:: Lazy-Load | Thread-Safe");
    }
}
