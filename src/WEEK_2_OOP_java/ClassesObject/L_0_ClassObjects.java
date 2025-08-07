package WEEK_2_OOP_java.ClassesObject;

public class L_0_ClassObjects {

    String name = "Rahul";
    int age = 10;

    public static void main(String[] args) {

        // Creating object tom using Class Animal and constructor
        Animal tom = new Animal();
        tom.name = "tom";
        tom.age = 10;
        tom.run();
        tom.eat();


        L_0_ClassObjects some = new L_0_ClassObjects();
        System.out.println(some.name);

        Bird1 sp = new Bird1();
        sp.name = "Sparrow";
        sp.color = "Black";
        sp.fly(sp.name);
    }
}

class Animal {
    String name;
    int age;

    public void run() {
        System.out.println(name + " running ! ");
    }

    public void eat() {
        System.out.println(name + " is eating ");
    }
}

class Bird1 {
    String name;
    String color;

    public void fly(String name) {
        System.out.println(name + " can fly");

    }
}
