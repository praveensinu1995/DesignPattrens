package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtract  implements Callable<Void> {
        private  Value value;

    public Subtract(Value value) {
        this.value = value;
    }

    private Lock lock;
        public  Subtract(Value value,Lock lock){
            this.value=value;
            this.lock=lock;
        }



    @Override
        public  Void call() throws Exception {
            for (int i = 0; i < 100; i++) {
//                lock.lock();
//                synchronized (value) {
//                    value.setX(value.getX() - i);
                value.incrementX(-i);
//                }
//                lock.unlock();
            }
            return null;
        }
    }
