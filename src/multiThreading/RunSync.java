package multiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunSync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value=new Value(0);
//        Lock lock=new  ReentrantLock();
//        Adder adder=new Adder(value,lock);
//        Subtract subtract=new Subtract(value,lock);
        Adder adder=new Adder(value);
        Subtract subtract=new Subtract(value);


        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<Void> added = executorService.submit(adder);
        Future<Void> subtracted = executorService.submit(subtract);
        added.get();
        subtracted.get();
        executorService.shutdown();

        System.out.println("value of x "+value.getX());

    }
}
