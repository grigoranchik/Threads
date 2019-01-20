package myThreads;

class MyRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("This is new thread");
        System.out.println(Thread.currentThread().getName());
        //someMethod();
    }

    /*public void someMethod(){
        throw new RuntimeExeption();
    }*/
}
