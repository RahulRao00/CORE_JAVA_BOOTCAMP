package src.WEEK_8_OOP_java.Inheritance;

class Object {

}

class Test1 extends Object {

    int x, y;
    // super() -> by default by java
    Test1() {
        x = 100;
        y = 200;
    }

    Test1(int x, int y) {
        // super()
        this.x = x;
        this.y = y;
    }
}

class Test2 extends Test1 {

    int a, b;

    Test2() {
        // super()
        a = 300;
        b = 400;
    }

    Test2(int a, int b) {
        // super()
        super(a, b);
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);

    }
}

public class L7_ParentChaining {

    public static void main(String[] args) {
        Test2 t2 = new Test2(9, 99);
        t2.display();

    }
}
