// package src.WEEK_8_OOP_java.Abstraction;


// An abstract class whose object can't be created 
// if a single variable is abstract then java force you to make class abstract 
// So that you can't create object of that class 
// Because that particular abstract method is incomplete 
abstract class Plane {

    abstract void takeOff();
    abstract void fly() ;
    abstract void land();

}

class CargoPlane extends Plane {

    void takeOff() {
        System.out.println("CargoPlane requires longer runway to takeoff...");
    }

    void fly() {
        System.out.println("Cargo is Flying at Low Height... ");
    }

    void land() {
        System.out.println("CargoPlane lands slowly due to heavy weight...");
    }

    void carryCargo() {
        System.out.println("CargoPlane is carrying cargos...");
    }
}


class PassengerPlane extends Plane {

    void takeOff() {
        System.out.println("PassengerPlane takes off smoothly...");
    }

    void fly() {
        System.out.println("PassengerPlane flies at Medium height...");
    }

    void land() {
        System.out.println("PassengerPlane lands on scheduled runway...");
    }

    void carryPassenger() {
        System.out.println("PassengerPlane is carrying passengers...");
    }
}


class FighterPlane extends Plane {

    void takeOff() {
        System.out.println("FighterPlane takes off vertically...");
    }

    void fly() {
        System.out.println("FighterPlanes fly at very high Height...");
    }

    void land() {
        System.out.println("FighterPlane lands quickly and sharply...");
    }

    void carryWeapon() {
        System.out.println("FighterPlane is carrying Weapons...");
    }
}


class Airport {

    // this method is loosely coupled work for different parameters this is true polymorphism 
    void permit( Plane ref) {

        ref.fly();
        ref.land();
        ref.takeOff();
        System.out.println();

    }
}

 public class L0_BasicAbstraction {
    public static void main(String[] args) {

       
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
        PassengerPlane pp = new PassengerPlane();

        Airport ap = new Airport();
        ap.permit(cp);
        ap.permit(pp);
        ap.permit(fp);
     
 
    }
}

