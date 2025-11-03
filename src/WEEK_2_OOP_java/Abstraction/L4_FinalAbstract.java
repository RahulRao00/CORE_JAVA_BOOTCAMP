package WEEK_2_OOP_java.Abstraction;


// class can't be abstract and final together
// both are against each other
// because if class is final that means we cant change anything in that class 
// if class is abstract then we must have to  extend that cals  provide the body to their method
// means final class -> no change  and   abstract class  -> change must


abstract class Bird {

    final int val = 10 ;
    abstract void eat();
    abstract void fly();

}


abstract class Eagle extends Bird {

    @Override
    void eat() {
        System.out.println(" ");
    }

    @Override
    void fly() {
        System.out.println("Eagle fly at high height ");
    }
}


public class L4_FinalAbstract {
    
}
