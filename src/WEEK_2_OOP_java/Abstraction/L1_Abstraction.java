import java.util.Scanner;

// Inside a class if a single method is abstract declare class as abstract 
// We can also create class as abstract without even abstract method 

abstract class Shape {

    float area;

    // abstract method -> without body -> incomplete method 
    abstract void acceptInput();

    abstract void calcArea();

    // concrete method -> complete method ->  method with body
    void disArea() {
        System.out.println(area);
    }
}

class Square extends Shape {

    private float side;

    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Square : ");
        side = sc.nextFloat();
    }

    void calcArea() {
        area = side * side;
    }

}

class Rectangle extends Shape {

    private float length;
    private float breadth;

    void acceptInput() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        length = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle : ");
        breadth = sc.nextFloat();
    }

    void calcArea() {
        area = length * breadth;
    }

}

class Circle extends Shape {

    private float radius;

    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the redius of square : ");
        radius = sc.nextFloat();
    }

    void calcArea() {
        area = (float) (3.14 * radius * radius);

    }
}

class Geometry {

    // loose coupling  -> to achieve true  polymorphism 
    void permit(Shape ref) {
        ref.acceptInput();
        ref.calcArea();
        ref.disArea();
    }
}

public class L1_Abstraction {
    public static void main(String[] args) {

        Shape sq = new Square();
        Shape re = new Rectangle();
        Shape ci = new Circle();

        Geometry g = new Geometry();
        g.permit(sq);
        g.permit(re);
        g.permit(ci);
       
    }
}
