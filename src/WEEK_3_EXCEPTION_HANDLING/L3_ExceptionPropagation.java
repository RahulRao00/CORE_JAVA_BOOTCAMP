package WEEK_3_EXCEPTION_HANDLING;

import java.util.Scanner;

// Here if we don't handle the exception then exception object will propagate
// through all the method then finally in the main it will terminate the execution 

class Exam1 {

    void fun1() {

        System.out.println("Connection Established ");

        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value 1: ");
            int a = sc.nextInt();
            System.out.print("Enter value 2: ");
            int b = sc.nextInt();

            int ans = a / b;
            System.out.println("ans is : " + ans);
            sc.close();

        } catch (Exception e) {

            System.out.println("Exception Handled in fun1() ! ");

        }

        System.out.println("Connection is terminated ! ");

    }

}

class Demo2 extends Exam1 {

    void fun2() {

        System.out.println("Connection 1 Established ");

        try {

            Exam1 d1 = new Exam1();
            d1.fun1();

        } catch (Exception e) {

            System.out.println("");

        }

        System.out.println("Connection 1 Terminated ");
    }

}

class Demo3 extends Demo2 {

    void fun3() {

        System.out.println("Connection 2 Established  ");

        Demo2 d2 = new Demo2();
        d2.fun2();

        System.out.println("Connection 2 Terminated ");

    }

}

public class L3_ExceptionPropagation {

    public static void main(String[] args) {
        System.out.println("Connection 1 is Established  ");

        Demo3 d3 = new Demo3();
        d3.fun3();

    }

}

