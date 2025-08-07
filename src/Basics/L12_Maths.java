package Basics;

public class L12_Maths {

        public static void main(String[] args) {

            System.out.println("📌 Basic Math Methods:\n");

            // 1. Absolute value
            System.out.println("Math.abs(-10) = " + Math.abs(-10)); // 10

            // 2. Max and Min
            System.out.println("Math.max(20, 30) = " + Math.max(20, 30)); // 30
            System.out.println("Math.min(20, 30) = " + Math.min(20, 30)); // 20

            // 3. Power and Square Root
            System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3)); // 8.0
            System.out.println("Math.sqrt(16) = " + Math.sqrt(16));   // 4.0

            // 4. Rounding operations
            System.out.println("Math.round(4.5) = " + Math.round(4.5));   // 5
            System.out.println("Math.round(4.4) = " + Math.round(4.4));   // 4
            System.out.println("Math.ceil(4.3) = " + Math.ceil(4.3));     // 5.0
            System.out.println("Math.floor(4.7) = " + Math.floor(4.7));   // 4.0

            // 5. Random number between 0.0 (inclusive) and 1.0 (exclusive)
            System.out.println("Math.random() = " + Math.random());

            // 6. Convert radians to degrees and vice versa
            System.out.println("Math.toDegrees(Math.PI) = " + Math.toDegrees(Math.PI));  // 180.0
            System.out.println("Math.toRadians(180) = " + Math.toRadians(180));          // π ≈ 3.14

            // 7. Trigonometric functions (input in radians)
            System.out.println("Math.sin(Math.PI/2) = " + Math.sin(Math.PI/2)); // 1.0
            System.out.println("Math.cos(0) = " + Math.cos(0));                 // 1.0
            System.out.println("Math.tan(0) = " + Math.tan(0));                 // 0.0

            // 8. Exponential and Logarithmic functions
            System.out.println("Math.exp(1) = " + Math.exp(1));    // e^1 ≈ 2.718
            System.out.println("Math.log(10) = " + Math.log(10));  // Natural log
            System.out.println("Math.log10(100) = " + Math.log10(100)); // 2

            // 9. Signum function
            System.out.println("Math.signum(10) = " + Math.signum(10));   // 1.0
            System.out.println("Math.signum(-10) = " + Math.signum(-10)); // -1.0
            System.out.println("Math.signum(0) = " + Math.signum(0));     // 0.0

            // 10. Edge case: sqrt of negative number returns NaN
            System.out.println("Math.sqrt(-25) = " + Math.sqrt(-25)); // NaN (Not a Number)

            // 11. Math constants
            System.out.println("Math.PI = " + Math.PI);   // 3.141592...
            System.out.println("Math.E = " + Math.E);     // 2.718281...
        }
    }




