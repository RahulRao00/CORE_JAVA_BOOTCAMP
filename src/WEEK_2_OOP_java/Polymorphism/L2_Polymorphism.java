 class Plane1 {

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

class CargoPlane1 extends Plane1 {

    void fly() {
        System.out.println("Cargo is Flying at Low Height... ");
    }

    void carryCargo() {
        System.out.println("CargoPlane is carrying cargos...");
    }
}

class PassengerPlane1 extends Plane1 {

    void fly() {
        System.out.println("Passenger fly at the Medium height... ");
    }

    void carryPassenger() {
        System.out.println("PassengerPlane is  carrying Passenger....   ");
    }

}

class FighterPlane1 extends Plane1 {

    void fly() {
        System.out.println("Fighter Planes fly at very high Height...");

    }

    void carryWeapon() {
        System.out.println("Fighter Plane is carrying Weapons... ");
    }
}

 public class L2_Polymorphism {
    public static void main(String[] args) {

        // Plane ref ;
        // ref = new CargoPlane();
        // ref = new PassengerPlane();
        // ref = new FighterPlane();
        // ref.fly();
        // ref.takeoff();
        // ref.lnad();


        // Array of parent references pointing to child objects
        Plane1 planes[] = {
                new CargoPlane1(),
                new FighterPlane1(),
                new PassengerPlane1()
        };

        // planes[0].fly();
        // planes[1].fly();

        // Loop using parent reference – full runtime polymorphism
        for (Plane1 plane : planes) {
            plane.fly();
            plane.takeOff();
            plane.land();

            // If you want to call specialized methods of child → use type casting to child
            // down casting -> parent into child   -> so can get specialized method as well 
            if (plane instanceof CargoPlane1) {

                ((CargoPlane1) plane).carryCargo();
            } else if (plane instanceof FighterPlane1) {

                ((FighterPlane1) plane).carryWeapon();
            } else {

                ((PassengerPlane1) plane).carryPassenger();
            }

        }

    }
}
