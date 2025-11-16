package WEEK_4_Multithreading;


public class L0_Basic_Multithreading extends Thread {

    // This thread only execute once in this complete process with one reference if we try to execute again then we get an error
    // Because after one execution thread will be considered as dead thread
    // To execute one more time we have to create different object/reference  thread of that class

    @Override
    public void run() {   // -> this run method is present in the thread class
        for( int i = 0; i< 100; i++ ) {
            System.out.println(" ------------------------------------------ ");
            System.out.println(Thread.currentThread().getName() );

        }
    }
}

// To achieve multithreading we have to create the object of that class
// and execute the start() method -> with the help of the reference of that class
// after this both (main & second thread  ) start executing independently

      class  Main {
        public static void main(String[] args) {

            L0_Basic_Multithreading t = new L0_Basic_Multithreading();
            t.start();   // this method  is executed to initiate the new thread
           // t.start(); -> Attempting to restart the same thread will throw IllegalThreadStateException

            for ( int i = 0 ; i < 100; i++ ) {
            System.out.println(Thread.currentThread().getName());
       }

        }
    }
