package src.WEEK_8_OOP_java.Inheritance;

class BankAccount {
    private int accNum;
    private int pin;

    public BankAccount() {
        // super
        System.out.println("Parent class constructor");
    }
}

class Hacker extends BankAccount {

    public Hacker() {
        // super
        System.out.println("Child Class constructor ");
    }
}

public class L6_ConstructorSuper {

    public static void main(String[] args) {
        Hacker h = new Hacker();

    }
}
