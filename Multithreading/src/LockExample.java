import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintDemo_l {
    private final Lock queueLock = new ReentrantLock();

    public void print() {
        queueLock.lock();

        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + "  Time Taken " + (duration / 1000) + " seconds.");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf(
                    "%s printed the document successfully.\n", Thread.currentThread().getName());
            queueLock.unlock();
        }
    }
}

class ThreadDemo_l extends Thread {
    PrintDemo_l  printDemo_l;

    ThreadDemo_l(String name,  PrintDemo_l printDemo_l) {
        super(name);
        this.printDemo_l = printDemo_l;
    }

    @Override
    public void run() {
        System.out.printf(
                "%s starts printing a document\n", Thread.currentThread().getName());
        printDemo_l.print();
    }
}

public class LockExample {

    public static void main(String args[]) {
        PrintDemo_l pd = new PrintDemo_l();

        ThreadDemo_l t1 = new ThreadDemo_l("Thread - 1 ", pd);
        ThreadDemo_l t2 = new ThreadDemo_l("Thread - 2 ", pd);
        ThreadDemo_l t3 = new ThreadDemo_l("Thread - 3 ", pd);
        ThreadDemo_l t4 = new ThreadDemo_l("Thread - 4 ", pd);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}