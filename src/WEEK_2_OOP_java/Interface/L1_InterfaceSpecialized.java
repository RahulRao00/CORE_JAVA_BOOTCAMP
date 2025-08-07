package src.WEEK_8_OOP_java.Interface;

interface Calculator0 {

    void add();
    void sub();

}

class MyCalculator1 implements Calculator0 {

    public void add() {
        System.out.println(10+202);
    }

    public void sub() {
        System.out.println(20-10);
    }

    public void mul(){
        System.out.println(10*20);
    }
}



public class L1_InterfaceSpecialized {
    
    public static void main(String[] args) {
        

        Calculator0 m = new MyCalculator1();
        m.add();
        m.sub();

        // down casting parent int child type  
        ((MyCalculator1) m).mul();

    }


}
