package multiThreading;

public class HelloWorldPrinter implements Runnable {
    public void print() {
        System.out.println("Hello world from -" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}
