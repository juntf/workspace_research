package DP02SingletonPattern;

public class SingletonDemo {

    /**
     * https://www.runoob.com/design-pattern/singleton-pattern.html
     * https://dzone.com/articles/java-singletons-using-enum
     * @param args
     */
    public static void main(String[] args) {

        SingletonBase object = SingletonBase.getInstance();
        object.showMessage();


        SingletonLazyLoadAndNonThreadSafe object1 = SingletonLazyLoadAndNonThreadSafe.getInstance();
        object1.showMessage();


        SingletonLazyLoadAndThreadSafe object2 = SingletonLazyLoadAndThreadSafe.getInstance();
        object2.showMessage();

        SingletonNonLazyLoadAndThreadSafe object3 = SingletonNonLazyLoadAndThreadSafe.getInstance();
        object3.showMessage();


        SingletonDoubleCheckedLock object4 = SingletonDoubleCheckedLock.getInstance();
        object4.showMessage();

        SingletonStaticInnerClass object5 = SingletonStaticInnerClass.getInstance();
        object5.showMessage();

        SingletonUsingEnum object6 = SingletonUsingEnum.INSTANCE;
        object6.showMessage();
    }
}
