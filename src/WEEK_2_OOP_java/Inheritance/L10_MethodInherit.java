package src.WEEK_8_OOP_java.Inheritance;

class Plane {

    void takeOff() {
        System.out.println("Plane is taking off.... ");
    }

    void fly() {
        System.out.println("Plane is flying... ");
    }

    void land() {
        System.out.println("Plane is landing... ");
    }

}

class CargoPlane extends Plane {

    void fly() {
        System.out.println("Cargo is Flying at Low Height... ");
    }

    void carryCargo() {
        System.out.println("CargoPlane is carrying cargos...");
    }
}

class PassengerPlane extends Plane {

    void fly() {
        System.out.println("Passenger fly at the Medium height... ");
    }

    void carryPassenger() {
        System.out.println("PassengerPlane is  carrying Passenger....   ");
    }

}

class FighterPlane extends Plane {

    void fly() {
        System.out.println("Fighter Planes fly at very high Height...");

    }

    void carryWeapon() {
        System.out.println("Fighter Plane is carrying Weapons... ");
    }
}

public class L10_MethodInherit {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        cp.takeOff();
        cp.fly();
        cp.land();
        cp.carryCargo();

        System.out.println();

        pp.takeOff();
        pp.fly();
        pp.land();
        pp.carryPassenger();

        System.out.println();

        fp.takeOff();
        fp.fly();
        fp.land();
        fp.carryWeapon();

    }
}
