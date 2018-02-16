package se.selborn.practice.threads;

import java.lang.reflect.Executable;

/**
 * Created by anders on 6/4/17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        PracticeRunnable runnable = new PracticeRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();

        Thread.sleep(2000);

        Thread t2 = new Thread(runnable);
        t2.start();


        Thread.sleep(2000);

        Thread t3 = new Thread(runnable);
        t3.start();


        PracticeThread practiceThread = new PracticeThread();
        practiceThread.start();

        Thread.sleep(2000);

        PracticeThread practiceThread1 = new PracticeThread();
        practiceThread1.start();;

        Thread t12 = new Thread(practiceThread);
        t12.start();

        Thread.sleep(2000);

        PracticeThread practiceThread2 = new PracticeThread();
        practiceThread2.start();

        Thread.sleep(2000);




    }

}
