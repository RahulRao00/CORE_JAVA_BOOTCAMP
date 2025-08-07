package src.WEEK_8_OOP_java.Polymorphism;


class Plane0 {

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

class CargoPlane0 extends Plane0 {

    void fly() {
        System.out.println("Cargo is Flying at Low Height... ");
    }

    void carryCargo() {
        System.out.println("CargoPlane is carrying cargos...");
    }
}

class PassengerPlane0 extends Plane0 {

    void fly() {
        System.out.println("Passenger fly at the Medium height... ");
    }

    void carryPassenger() {
        System.out.println("PassengerPlane is  carrying Passenger....   ");
    }

}

class FighterPlane0 extends Plane0 {

    void fly() {
        System.out.println("Fighter Planes fly at very high Height...");

    }

    void carryWeapon() {
        System.out.println("Fighter Plane is carrying Weapons... ");
    }
}

class Airport {

    // this method is loosely coupled work for different parameters, true polymorphism 
    void permit( Plane0 ref) {

        ref.fly();
        ref.land();
        ref.takeOff();
        System.out.println();

    }
}

 public class L3_CompletePolymorphism {
    public static void main(String[] args) {

    //    tightly coupled 
        CargoPlane0 cp = new CargoPlane0();
        FighterPlane0 fp = new FighterPlane0();
        PassengerPlane0 pp = new PassengerPlane0();

        Airport ap = new Airport();
        ap.permit(cp);
        ap.permit(pp);
        ap.permit(fp);
     

        
    }
}


