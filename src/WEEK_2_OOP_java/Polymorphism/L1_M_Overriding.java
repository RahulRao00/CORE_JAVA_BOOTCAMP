package src.WEEK_8_OOP_java.Polymorphism;
// package Polymorphism;


class Parent {
    void show() {
        System.out.println("1");
    }
}
    
class L1_M_Overriding extends Parent {

    void show() {
        System.out.println("2"); // this overrides the parent method
    }

    public static void main(String[] args) {

        L1_M_Overriding obj = new L1_M_Overriding();
        obj.show();
    }
}
