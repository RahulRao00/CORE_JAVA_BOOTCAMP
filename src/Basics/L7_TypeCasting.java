package Basics;

public class L7_TypeCasting {

        public static void main(String[] args) {
            //  1. IMPLICIT CASTING (Widening) → safe
            int intVal = 100;
            long longVal = intVal;          // int → long
            float floatVal = longVal;       // long → float
            double doubleVal = floatVal;    // float → double

            System.out.println("Implicit: int → long → float → double = " + doubleVal);

            //  2. EXPLICIT CASTING (Narrowing) → data loss possible
            double d = 123.987;
            int i = (int) d;   // loses decimal part
            byte b = (byte) i; // can overflow

            System.out.println("Explicit double to int = " + i);       // 123
            System.out.println("Explicit int to byte = " + b);         // 123 (safe)

            int large = 130;
            byte overflowed = (byte) large; // Overflow: 130 → -126
            System.out.println("Overflow casting int(130) to byte = " + overflowed);

            //  3. CHAR ↔ INT
            char ch = 'A';
            int ascii = ch;              // implicit
            char newChar = (char) (ascii + 2); // explicit

            System.out.println("char to int (A) = " + ascii);         // 65
            System.out.println("int to char (65+2) = " + newChar);    // 'C'

            //  4. BOOLEAN CANNOT BE CASTED
            boolean flag = true;
            // int num = (int) flag;  //  Compile Error: incompatible types

            //  5. BYTE + BYTE → int
            byte a = 10;
            byte b2 = 20;
            int sum = a + b2; // byte + byte → int
            System.out.println("byte + byte → int = " + sum);

            //  6. Upcasting and Downcasting with objects
            Animal a1 = new Dog();       // Upcasting: Dog → Animal ✅
            a1.sound();

            Dog d1 = (Dog) a1;           // Downcasting: Animal → Dog ✅
            d1.bark();

            //  Edge Case: Invalid downcasting
            Animal a2 = new Animal();
            // Dog d2 = (Dog) a2;       //  Runtime Error: ClassCastException
            // d2.bark();

            System.out.println("Safe object downcasting requires instanceof check:");
            if (a2 instanceof Dog) {
                Dog safeDog = (Dog) a2;
                safeDog.bark();
            } else {
                System.out.println(" Cannot cast Animal to Dog");
            }
        }
    }

    //  Extra classes to demonstrate object casting
    class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks ");
        }
    }




