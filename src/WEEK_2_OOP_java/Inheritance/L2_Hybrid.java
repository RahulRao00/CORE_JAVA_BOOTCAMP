package src.WEEK_8_OOP_java.Inheritance;

class Parent0 {
    void print() {
        System.out.println("This is parent class");
    }
}

class L2_Hybrid  extends Parent0 {
    public static void main(String[] args) {
    
        L2_Hybrid ch = new L2_Hybrid();
        ch.print();

        Hybrid hb = new Hybrid();
        hb.print();
    }
}

class Hybrid  extends Parent0 {
    public static void main(String[] args) {
        
        Hybrid ch = new Hybrid();
        ch.print();

    }
}

