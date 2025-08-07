package src.WEEK_8_OOP_java.Encapsulation;
// package Encapsulation;

class Costumer1{

    private int cId;
    private String cName;
    private long cNum;

    public Costumer1(int cId, String cName, long cNum) {
        // this resolve shadowing problem
        this.cId = cId;
        this.cName = cName;
        this.cNum = cNum;

    }

    public Costumer1() {
        cId = 01;
        cName = "RahulRao";
        cNum = 1234512345;
    }

    public int getCid() {
        return cId;
    }

    public String getCname() {
        return cName;
    }

    public long getCnum() {
        return cNum;
    }

}

public class L2_Constructor {
    public static void main(String[] args) {

        Costumer1 c = new Costumer1(1, "Rahul", 1234561234);
        // c.setData(1, "Rahul", 1234561234);
        System.out.println(c.getCid());
        System.out.println(c.getCname());
        System.out.println(c.getCnum());

        Costumer1 c1 = new Costumer1();
        System.out.println(c1.getCid());
        System.out.println(c1.getCname());
        System.out.println(c1.getCnum());
    }

}
