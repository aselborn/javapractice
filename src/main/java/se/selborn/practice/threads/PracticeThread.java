package se.selborn.practice.threads;

/**
 * Created by anders on 6/4/17.
 */
public class PracticeThread extends Thread {
    private int counter = 0;

    public void run(){
        counter++;
        System.out.println("Thread method count = " + counter);
    }

}
