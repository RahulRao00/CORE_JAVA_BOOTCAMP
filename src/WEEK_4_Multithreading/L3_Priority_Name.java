package WEEK_4_Multithreading;


class MyThread3 extends Thread {

    MyThread3() {}

    public  MyThread3( String name) {
        super(name);
    }
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " Priority" + Thread.currentThread().getPriority() );
    }
}


public class L3_Priority_Name {
    public static void main(String[] args) {

        MyThread3 thread = new MyThread3("some Thread ");
        thread.start();
        MyThread3 thread1 = new MyThread3();
        MyThread3 thread2 = new MyThread3();


    }
}
