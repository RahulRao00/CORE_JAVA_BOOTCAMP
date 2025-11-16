package WEEK_4_Multithreading;

 class MyThread implements Runnable {

     // This thread only execute once in this complete process with one reference if we try to execute again then we get an error
     // Because after one execution thread will be considered as dead thread
     // To execute one more time we have to create different object/reference  thread of that class

    @Override
    public void run() {
        for( int i = 0 ; i < 80; i++ ) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getName());
        }
    }
}

class L1_RunnableInt  {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();  // NEW STATE
        Thread t = new Thread( myThread );

        Thread thread = new Thread(new MyThread());
        Thread thread1 = new Thread(new MyThread());

        t.start();        // RUNNABLE -> Waiting for the execution
        thread.start();
        thread1.start();
      //  t.start(); -> Attempting to restart the same thread will throw IllegalThreadStateException


        for ( int i = 0; i < 90; i++ ) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
