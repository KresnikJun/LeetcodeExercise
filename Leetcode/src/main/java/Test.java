import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = newFixedThreadPool(2);
//        CountDownLatch countDownLatch = new CountDownLatch(2);
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        es.submit(t1);
        es.submit(t2);
        es.shutdown();
        boolean isFinished = es.awaitTermination(5, TimeUnit.SECONDS);
        if(isFinished) {
            t3.run();
        } else {
            System.out.println("Not finished");
        }
    }

    public static class Task1 implements Runnable{
        @Override
        public void run() {
            System.out.println("getTask1");
        }
    }

    public static class Task2 implements Runnable{
        @Override
        public void run() {
            System.out.println("getTask2");
            try {
                TimeUnit.SECONDS.sleep(11);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Task3{
        public void run() {
            System.out.println("getTask3");
        }
    }
}
