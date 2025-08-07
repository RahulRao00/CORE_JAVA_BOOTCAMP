
// A class can implements as many number of interfaces because 
// interfaces don't have any parent interface like object class 
// So here is now diamond shape  problem 
// Can also achieve multiple inheritance no diamond shape problem 

interface Calculator1 {

    void add();

    void sub();

}

interface Calculator2 {

    void mul();

    void div();

}

class MyCalculator implements Calculator1, Calculator2 {

    public void add() {
        System.out.println("Addition...");

    }

    public void sub() {
        System.out.println("Subtraction...");

    }

    public void mul() {
        System.out.println("Multiplication...");

    }

    public void div() {
        System.out.println("Divide...");

    }

}

public class L2_MultipleInterface {

    public static void main(String[] args) {

        MyCalculator c = new MyCalculator();
        c.add();
        c.sub();
        c.mul();
        c.div();

    }

}
