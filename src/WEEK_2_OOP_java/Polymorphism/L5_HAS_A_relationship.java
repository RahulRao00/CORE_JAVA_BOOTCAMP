// package src.WEEK_8_OOP_java.Polymorphism;

// HAS-A relationship is of two type 
// 1. HAS-A Composition( Strong )
// 2. HAS-A Assertion( Weak )

class Charger {

    private String brand;
    private int voltage;

    Charger() {
        // default charger constructor
    }

    public Charger(String name, int voltage) {
        this.brand = name;
        this.voltage = voltage;
    }

    String getBrand() {
        return brand;
    }

    int getVoltage() {
        return voltage;
    }
}

class OS {

    private String osName;
    private int size;

    OS() {
        // default OS constructor
    }

    public OS(String osName, int size) {
        this.osName = osName;
        this.size = size;
    }

    String getName() {
        return osName;
    }

    int getSize() {
        return size;
    }

}

class Mobile {

    // object inside another object -> composition
    // only access with the help of the mobile -> mobile HAS-A os
    OS os = new OS("Android", 512);

    // Aggregation -> create method can access by mobile and by directly charger
    // loose coupling 
    void hasA(Charger c) {
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}

public class L5_HAS_A_relationship {
    public static void main(String[] args) {

        Mobile m = new Mobile();
        Charger c = new Charger("Apple", 100);

        // only through mobile we can access OS
        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());

        // charger with mobile
        m.hasA(c);

        // mobile have no reference cant get OS 
        m = null;
        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());

        m.hasA(c);

        // without mobile we can access the charger
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());

    }
}
