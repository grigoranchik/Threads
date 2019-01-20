package SynchronizedThreeds;

/*import myThreads.MyRunnable;
import myThreads.MyThread;*/

public class Main{

    public static void main(String []args) throws Exception{

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();


    }
}
