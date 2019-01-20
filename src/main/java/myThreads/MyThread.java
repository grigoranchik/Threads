package myThreads;

class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("This is new thread");
        System.out.println(Thread.currentThread().getName());
        //someMethod();
    }
}
