package DP02SingletonPattern;

public class SingletonLazyLoadAndNonThreadSafe {
    private static SingletonLazyLoadAndNonThreadSafe instance;

    private SingletonLazyLoadAndNonThreadSafe() {}
    public static SingletonLazyLoadAndNonThreadSafe getInstance() {

        // Lazy
        if(instance == null) {
            instance = new SingletonLazyLoadAndNonThreadSafe();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton:: LazyLoad | Non-Thread-Safe");
    }
}
