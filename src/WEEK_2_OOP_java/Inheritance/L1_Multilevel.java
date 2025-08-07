package src.WEEK_8_OOP_java.Inheritance;

class Demo1 {
    void fun1() {
        System.out.println("JAVA");
    }
}

class Demo2 extends Demo1 {
    void fun2() {
        System.out.println("PYTHON");
    }
}

class Demo3 extends Demo2 {
    void fun3() {
        System.out.println("JAVASCRIPT");
    }
}

public class L1_Multilevel {
    public static void main(String[] args) {

        Demo3 d3 = new Demo3();
        d3.fun1();
        d3.fun2();
        d3.fun3();

    }
}