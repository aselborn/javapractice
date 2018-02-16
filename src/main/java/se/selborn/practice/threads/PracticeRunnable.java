package se.selborn.practice.threads;

/**
 * Created by anders on 6/4/17.
 */
public class PracticeRunnable implements Runnable{


    int counter = 0;

    @Override
    public void run() {
        counter++;
        System.out.println("RunMethod, count = " + counter);
    }
}
