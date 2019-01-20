package myThreads;

public class Main{

    public static void main(String []args) throws Exception{

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();

        //Thread.sleep(1000);
        Thread.yield();
        System.out.println("Hello World");

    }
}