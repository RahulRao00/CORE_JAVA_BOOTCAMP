// package src.WEEK_8_OOP_java.Polymorphism;

// overriding the parent method only if child,s access modifier is same/more accessibility 
// Return type must be same a the parent method 
// if return type different must be Co-variant-> IS-A relationship is must be there 

class Parent {

    public void fun1() {
        System.out.println("Fun method inside Parent   ");
    }

}

class Child extends Parent {
    // not work because default accessibility < public so cant override
    // void fun1() {
    // System.out.println("Overridden method ");
    // }

    public void fun1() {
        System.out.println("Overridden method inside child ");
    }

    Parent p = new Parent();

    // return object type
    Parent fun2() {
        return p;
    }

}

public class L4_OverridingAccess {

    public static void main(String[] args) {

        Child c = new Child();
        c.fun1();

    }

}
