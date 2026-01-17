package multiThreading;

public class client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        Thread thread = new Thread(helloWorldPrinter);
        System.out.println(Thread.currentThread().getName());
        thread.start();
        Thread thread1 = new Thread(new HelloWorldPrinter());
        thread1.start();
        System.out.println("after calling thread ");
    }
}
