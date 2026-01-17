package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value value;
    private Lock lock;

    public Adder(Value value) {
        this.value = value;
    }

    public Adder(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 100; i++) {
//            lock.lock();
//            synchronized (value) {
//                value.setX(value.getX() + i);
//            }
            value.incrementX(i);
            //            lock.unlock();
        }
        return null;
    }
}
