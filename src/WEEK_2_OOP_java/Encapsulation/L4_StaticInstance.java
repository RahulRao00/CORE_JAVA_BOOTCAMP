package src.WEEK_8_OOP_java.Encapsulation;

class Test {

    static int a, b;

    static {
        System.out.println("Inside Static block");
        a = 10;
        b = 20;
        // x = 100;
    }

    static void fun1() {
        System.out.println("Inside Static method");
    }

    int x, y;

    {
        System.out.println("Inside Instance block");
    }

    void fun2() {
        System.out.println("Inside Instance method");
    }

    public Test() {
        System.out.println("Inside Constructor ");
    }

}

public class L4_StaticInstance {

    public static void main(String[] args) {

        Test.fun1();
        Test t = new Test();
        t.fun2();

    }
}

