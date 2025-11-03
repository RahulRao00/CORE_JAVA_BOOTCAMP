package WEEK_4_Multithreading;


 class MyThread implements Runnable {

    @Override
    public void run() {

        for( int i = 0 ; i < 100; i++ ) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getName());
        }

    }
}


class L1_RunnableInt  {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        Thread thread = new Thread(new MyThread());
        t.start();
        thread.start();
      //  t.start();

        for ( int i = 0; i < 100; i++ ) {
            System.out.println(Thread.currentThread().getName());
        }


    }

}
