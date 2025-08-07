// package src.WEEK_8_OOP_java.Polymorphism;

public class L0_M_Overloading {

    // Which function is going to call is decided by the compiler 
    int sum(int a, int b) {
        return a + b;
    }

    double sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        L0_M_Overloading obj = new L0_M_Overloading();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(2, 3, 5));
    }
}


