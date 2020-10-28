package SingletonPattern;

public class SingletonNonLazyLoadAndThreadSafe {

    private static SingletonNonLazyLoadAndThreadSafe instance  = new SingletonNonLazyLoadAndThreadSafe();
    private SingletonNonLazyLoadAndThreadSafe() {}

    public static SingletonNonLazyLoadAndThreadSafe getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton:: Non-LazyLoad | Thread-Safe");
    }
}
