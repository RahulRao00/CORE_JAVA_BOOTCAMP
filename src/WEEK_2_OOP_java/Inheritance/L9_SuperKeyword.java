package src.WEEK_8_OOP_java.Inheritance;

class Demo_1 {
    int x = 100;
}

class Demo_2 extends Demo_1 {

    int x = 200;

    void display() {
        // super refer to the parent class 
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class L9_SuperKeyword {

    public static void main(String[] args) {
        Demo_2 d2 = new Demo_2();
        d2.display();

    }
}
