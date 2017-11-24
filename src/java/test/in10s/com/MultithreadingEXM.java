/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.in10s.com;

/**
 *
 * @author Administrator
 */
public class MultithreadingEXM extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        MultithreadingEXM t1 = new MultithreadingEXM();
        MultithreadingEXM t2 = new MultithreadingEXM();

        t1.start();
        t2.start();
    }
}
