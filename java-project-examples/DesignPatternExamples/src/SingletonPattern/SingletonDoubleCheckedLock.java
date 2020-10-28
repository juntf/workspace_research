package SingletonPattern;

public class SingletonDoubleCheckedLock {

    private volatile static SingletonDoubleCheckedLock instance;
    private SingletonDoubleCheckedLock() {}

    public static SingletonDoubleCheckedLock getInstance() {
        if(instance == null) {
            synchronized (SingletonDoubleCheckedLock.class) {
                if(instance == null) {
                    instance = new SingletonDoubleCheckedLock();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton DCL:: Lazy-Load | Thread-Safe");
    }
}
