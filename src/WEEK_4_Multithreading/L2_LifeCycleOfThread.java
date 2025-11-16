package WEEK_4_Multithreading;

class My_Thread extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(5000);  // -> thread will sleep for 5 sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" Executing the new thread ");

    }
}

public class L2_LifeCycleOfThread {
    public static void main(String[] args) throws InterruptedException {

        My_Thread thread = new My_Thread();  // NEW STATE
        System.out.println(thread.getState());

        thread.start();   // RUNNABLE or RUNNING STATE
        System.out.println( thread.getState());

        thread.join();   // through this main method will wait until the thread will execute
        for (int i = 0; i < 10; i++) {
            System.out.println("this is another thread is running ");
        }

        thread.sleep(1000);
        System.out.println(thread.getState());

    }
}


