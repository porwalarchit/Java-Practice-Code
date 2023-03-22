class ThreadDemo_t extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo_t(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );

        try {

            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);

                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );

        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class TestThread_Thread {

    public static void main(String args[]) {
        ThreadDemo_t t1 = new ThreadDemo_t("Thread-1");
        t1.start();

        ThreadDemo_t t2 = new ThreadDemo_t("Thread-2");
        t2.start();
    }
}