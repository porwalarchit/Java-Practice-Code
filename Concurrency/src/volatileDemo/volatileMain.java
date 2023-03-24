package volatileDemo;

class volatileMain
{
    private final static int noOfThreads = 2;
    public static void main(String[] args) throws InterruptedException
    {
        VolatileData volatileData = new VolatileData();     //object of VolatileData class
        Thread t1, t2;     //creating Thread objects
            t1 = new VolatileThread(volatileData);
            t2 = new VolatileThread(volatileData);

            //start all reader threads
            t1.start();
            t2.start();

            //wait for all threads
            t1.join();
            t2.join();
    }
}