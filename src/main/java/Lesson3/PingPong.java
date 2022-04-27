package Lesson3;

import static java.lang.Thread.sleep;

public class PingPong {

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        pingPong.start();
    }

    protected void start() {
        Thread ping = new Thread(new ThreadWord(), "Ping");
        ping.start();
        Thread pong = new Thread(new ThreadWord(), "Pong");
        pong.start();
    }

    protected class ThreadWord implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    printThreadWord();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

        protected synchronized void printThreadWord() throws InterruptedException {
            System.out.println(Thread.currentThread().getName());
            sleep(700);
            notifyAll();
            wait();
        }
    }
