package top.daoyang.innerclasses.controller;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        long l = System.nanoTime();
        return l >= eventTime;
    }

    public abstract void action();
}
