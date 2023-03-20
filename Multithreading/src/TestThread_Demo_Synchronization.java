class PrintDemo_Synchronized {
    public void printCount() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Counter   ---   "  + i );
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}

class ThreadDemo_Synchronized extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo_Synchronized  PD1;

    ThreadDemo_Synchronized( String name,  PrintDemo_Synchronized pd1) {
        threadName = name;
        PD1 = pd1;
    }

    public void run() {
        synchronized(PD1) {
            PD1.printCount();
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
public class TestThread_Demo_Synchronization {
    public static void main(String args[]) {

        PrintDemo_Synchronized PD1 = new PrintDemo_Synchronized();

        ThreadDemo_Synchronized T1 = new ThreadDemo_Synchronized( "Thread - 1 ", PD1 );
        ThreadDemo_Synchronized T2 = new ThreadDemo_Synchronized( "Thread - 2 ", PD1 );

        T1.start();

        T2.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }
}