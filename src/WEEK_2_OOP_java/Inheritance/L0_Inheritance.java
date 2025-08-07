package src.WEEK_8_OOP_java.Inheritance;

// we can achieve inheritance using extends keyword and abstract the properties of the parent class into child class
// The class which inherits the properties of another class is called the child class or subclass.
// The class whose properties are inherited is called the parent class or superclass.

class Parent {
    String name = "Rahul";
     void display() {
      System.out.println(name);
     }
  } 

public class L0_Inheritance extends Parent {

      public static void main(String[] args) {
        
        L0_Inheritance obj = new L0_Inheritance();
        obj.display();
      }
    }
