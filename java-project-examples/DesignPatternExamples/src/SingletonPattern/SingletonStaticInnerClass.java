package SingletonPattern;

public class SingletonStaticInnerClass {

    private static class SingletonHolder {
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    private SingletonStaticInnerClass() {}
    public static final SingletonStaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Singleton StaticInnerClass:: Lazy-Load | Thread-Safe");
    }
}
