package src.WEEK_8_OOP_java.Encapsulation;
// package Encapsulation;

class Costumer {

    private int cId;
    private String cName;
    private long cNum;

    public void setData(int cId, String cName, long cNum) {

        this.cId = cId;
        this.cName = cName;
        this.cNum = cNum;

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

public class L1_GetterSetter {

    public static void main(String[] args) {

        Costumer c = new Costumer();
        c.setData(1, "Rahul", 1234561234);
        System.out.println(c.getCid());
        System.out.println(c.getCname());
        System.out.println(c.getCnum());

    }

}
