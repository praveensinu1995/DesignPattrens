package multiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNoClient {
    public static void main(String[] args) {
//        in below example we are creating 100 new threads and passing the PrintNo object
//        for (int i=1;i<=100;i++){
//            Thread thread=new Thread(new PrintNo(i));
//            thread.start();
//        }
        System.out.println("=========================================================");
        System.out.println("Executor service");

//        in below, we will not create 100 new thread instead we will get the 10
//        no of threads from executor service and use those thread to print no 1-100
//        one after the other
        ExecutorService executorService=Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            if(i==80){
                System.out.println(i);
            }
            PrintNo printNo=new PrintNo(i);
            executorService.execute(printNo);
        }
    }
}
