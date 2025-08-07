package src.WEEK_8_OOP_java.Abstraction;// package src.WEEK_8_OOP_java.Abstraction;


// An abstract class whose object can't be created 
// if a single variable is abstract then java force you to make class abstract 
// So that you can't create object of that class 
// Because that particular abstract method is incomplete 

 abstract class User {

   abstract void scanQR();

    void makePayment() {
        System.out.println("Payment in done ! ");

    }

    void checkBalance() {
        System.out.println("You balance is : ");
    }
}


public class L2_AbstractClass {

    public static void main(String[] args) {
        
        User u = new User() {
            @Override
            void scanQR() {

            }
        };
        u.checkBalance();
        u.makePayment();

    }
}