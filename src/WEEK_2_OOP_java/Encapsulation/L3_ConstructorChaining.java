package src.WEEK_8_OOP_java.Encapsulation;
// package Encapsulation;
// Local Chaining 
class Customer {
    private int cID;
    private String cName;
    private int cNum;

    public Customer(String cName) {
        this.cName = cName;
    }

    public Customer() {
        this("NO_Name");
        cID = 1;
        cName = "Rahul";
        cNum = 234523563;
    }

    public Customer(int cID, String cName, int cNum) {
        this();
        this.cName = "AnotherName";
        // this();
    }

    public int getCid() {
        // this();
        return cID;
    }

    public String getName() {
        return cName;
    }

    public int getNum() {
        return cNum;
    }

}

public class L3_ConstructorChaining {
    public static void main(String[] args) {

        Customer c = new Customer(2, "RahulRao", 983210);
        System.out.println(c.getCid());
        System.out.println(c.getName());
        System.out.println(c.getNum());

    }

}
