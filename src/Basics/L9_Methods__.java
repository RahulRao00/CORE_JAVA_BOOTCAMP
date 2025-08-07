package Basics;

public class L9_Methods__ {


        // 🔹 1. Simple method (no return, no parameter)
        public void greet() {
            System.out.println("Hello, Rahul! Welcome to Java Methods 🚀");
        }

        // 🔹 2. Method with parameters (no return)
        public void printSum(int a, int b) {
            System.out.println("Sum: " + (a + b));
        }

        // 🔹 3. Method with return type
        public int square(int x) {
            return x * x;
        }

        // 🔹 4. Method with multiple return possibilities (edge case)
        public String checkEvenOdd(int num) {
            if (num % 2 == 0) return "Even";
            else return "Odd";
        }

        // 🔹 5. Static method
        public static void staticHello() {
            System.out.println("Hello from a static method!");
        }

        // 🔹 6. Method Overloading (same name, different parameters)
        public void showInfo() {
            System.out.println("No info provided.");
        }

        public void showInfo(String name) {
            System.out.println("Name: " + name);
        }

        public void showInfo(String name, int age) {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        // 🔹 7. Edge case: return early
        public void demoEarlyReturn(boolean condition) {
            if (condition) {
                System.out.println("Early exit!");
                return;
            }
            System.out.println("Normal flow continues...");
        }

        public static void main(String[] args) {
            L9_Methods__ obj = new L9_Methods__();

            obj.greet();                              // Basic method
            obj.printSum(10, 20);                     // With parameters
            System.out.println("Square: " + obj.square(5)); // With return

            System.out.println("Check 7: " + obj.checkEvenOdd(7)); // Odd/Even logic

            staticHello();                            // Calling static method

            obj.showInfo();                           // Overloading: no args
            obj.showInfo("Rahul");                    // Overloading: 1 arg
            obj.showInfo("Rahul", 21);                // Overloading: 2 args

            obj.demoEarlyReturn(true);                // Early return test
            obj.demoEarlyReturn(false);               // Normal flow
        }
    }






