package src.WEEK_8_OOP_java.Abstraction;
// final variable  value cant be changed 
// final method can be inherited but cant be changed 
// if class is final the we cant inherit that class 

final class Example {

    final int a = 10;

    void fun() {
        System.out.println(a);
        //a = 20;
        System.out.println(a);
    }
}

// cant inherit final class because if we can inherit we can also change that,
// So
// this is not allowed

//class Some extends Example {

//}

public class L5_finalKeyword {

    public static void main(String[] args) {

        Example e = new Example();
        e.fun();

    }
}