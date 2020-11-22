package DP09ObserverPattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
