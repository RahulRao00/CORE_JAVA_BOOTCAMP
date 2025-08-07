
// Interface is collection of the pure abstract methods 
// by default inside an interface all the methods are public and abstract 
// Interface -> An interface is a contract or blueprint for classes. 
// It defines what operations should be performed but not how
// interface promotes Standardization 
// Interface promotes polymorphism 

import java.util.Scanner;

interface Calculator {

   void add();

   void sub();

}

class Example1 implements Calculator {

   int a;
   int b;

   public void add() {
      a = 10;
      b = 20;
      System.out.println("Sum is : " + (a + b));
   }

   public void sub() {
      a = 100;
      b = 50;
      System.out.println("Subtract is : " + (a - b));
   }
}

class Example2 implements Calculator {
   public void add() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a: ");
      int a = sc.nextInt();
      System.out.print("Enter b: ");
      int b = sc.nextInt();
      System.out.println("Addition is : " + (a + b));
   }

   public void sub() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a: ");
      int a = sc.nextInt();
      System.out.print("Enter b: ");
      int b = sc.nextInt();
      System.out.println("Subtraction is : " + (a - b));
   }
}

class Example3 implements Calculator {

   public void add() {
      System.out.println(100 + 20);
   }

   public void sub() {
      System.out.println(100 - 20);
   }

}

// loose coupling

class operation {

   void permit(Calculator ref) {
      ref.add();
      ref.sub();

   }

}

public class L0_BasicInterface {

   public static void main(String[] args) {

      Calculator e1 = new Example1();
      Calculator e2 = new Example2();
      Calculator e3 = new Example3();

      operation o = new operation();
      o.permit(e1);
      o.permit(e2);
      o.permit(e3);

   }
}
