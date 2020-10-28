package SingletonPattern;

public class SingletonLazyLoadAndThreadSafe {
    private static SingletonLazyLoadAndThreadSafe instance;
    private SingletonLazyLoadAndThreadSafe() {}

    // synchronized
    public static synchronized SingletonLazyLoadAndThreadSafe getInstance() {
        if(instance == null) {
            instance = new SingletonLazyLoadAndThreadSafe();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton:: LazyLoad | Thread-Safe");
    }
}
