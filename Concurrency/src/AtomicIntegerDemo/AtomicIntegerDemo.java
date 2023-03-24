package AtomicIntegerDemo;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    static class Counter {
//        private AtomicInteger c = new AtomicInteger(0);
        int c = 0;
//        private AtomicInteger c2 = new AtomicInteger(0);

        public void increment() {
            c++;
//            c.getAndIncrement();
        }

        public int value() {
//            return c.get();
            return c;
        }

    }

    public static void main(final String[] arguments) throws InterruptedException {
        final Counter counter = new Counter();
        final Counter c2 = new Counter();

        //1000 threads
        for(int i = 0; i < 1000 ; i++) {

            new Thread(new Runnable() {
                public void run() {
                    counter.increment();
                }
            }).start();
        }
        for(int i = 0; i < 100 ; i++) {

            new Thread(new Runnable() {
                public void run() {
                    c2.increment();
                }
            }).start();
        }
//        Thread.sleep(6000);
        System.out.println("Final number (should be 1000): " + counter.value());
        System.out.println("Final number: " + c2.value());
    }
}