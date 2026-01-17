package multiThreading;

public class PrintNo implements Runnable{

    int number;
    public PrintNo(int number){
        this.number=number;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " printing number in this thread "+number);
    }
}
