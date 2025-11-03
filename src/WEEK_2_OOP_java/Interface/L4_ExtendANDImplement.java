package WEEK_2_OOP_java.Interface;

// A class can Implement an interface and also Extend another class 
// First extend then implement follow this order 
// because class only extend one class 
// but can implement any number of interfaces 

interface Interface {

    void some();
}

class MyClass {

    int add1( int a, int b ) {
        return a+b;
    }
}

class AnotherClass extends MyClass implements Interface {

    public void some() {

    }
}



public class L4_ExtendANDImplement extends AnotherClass {

    public static void main(String[] args) {

        L4_ExtendANDImplement n = new L4_ExtendANDImplement();
        int val =  n.add1( 2,5);
        System.out.println(val);


    }
}
