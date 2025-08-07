package src.WEEK_8_OOP_java.Encapsulation;
// package Encapsulation;

class BankAccount {

    // Achieve Encapsulation by data security
    private int bal;
    private int creditAmount;
    private String userType;

    // controlled access on the data using getter and setter
    public void setData(int data) {
        if (data > 0) {
            bal = data;
        } else {
            System.out.println("Balance can't be Negative ");
            System.exit(0);
        }
    }

    public int getData() {
        return bal;
    }
}


public class L0_BasicENC {

    public static void main(String[] args) {

        BankAccount bc = new BankAccount();
        bc.setData(100);
        System.out.println(bc.getData());

    }
}
