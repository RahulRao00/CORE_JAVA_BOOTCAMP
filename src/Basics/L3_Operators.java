package Basics;

public class L3_Operators {
    public static void main(String[] args) {

        // ============================
        //  1. Arithmetic Operators
        // ============================
        System.out.println("=== Arithmetic Operators ===");
        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (integer division)
        System.out.println("a % b = " + (a % b)); // 1 (remainder)

        //  Edge Case: division by 0
        try {
            int x = 10 / 0; // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero is not allowed.");
        }

        // Floating point division
        double d1 = 10.0;
        double d2 = 0.0;
        System.out.println("10.0 / 0.0 = " + (d1 / d2)); // Infinity (NOT exception!)

        // ============================
        //  2. Relational (Comparison) Operators
        // ============================
        System.out.println("\n=== Relational Operators ===");
        int p = 5, q = 10;

        System.out.println("p == q: " + (p == q)); // false
        System.out.println("p != q: " + (p != q)); // true
        System.out.println("p > q: " + (p > q));   // false
        System.out.println("p < q: " + (p < q));   // true
        System.out.println("p >= q: " + (p >= q)); // false
        System.out.println("p <= q: " + (p <= q)); // true

        //  Caution: == with floating points
        double d3 = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3: " + (d3 == 0.3)); // false due to precision error

        // ============================
        //  3. Logical Operators
        // ============================
        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;

        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false

        //  Short-circuit behavior
        int count = 0;
        boolean test = (count < 1) || (++count < 1); // second condition skipped
        System.out.println("Short-circuit count: " + count); // 0

        // ============================
        // 4. Bitwise Operators
        // ============================
        System.out.println("\n=== Bitwise Operators ===");
        int m = 5;  // 0101
        int n = 3;  // 0011

        System.out.println("m & n: " + (m & n));  // 1 (0001)
        System.out.println("m | n: " + (m | n));  // 7 (0111)
        System.out.println("m ^ n: " + (m ^ n));  // 6 (0110)
        System.out.println("~m: " + (~m));        // -6 (inverts bits)

        // ============================
        // 5. Assignment Operators
        // ============================
        System.out.println("\n=== Assignment Operators ===");
        int val = 10;
        val += 5; // val = val + 5
        System.out.println("val += 5: " + val); // 15

        val -= 3;
        val *= 2;
        val /= 4;
        System.out.println("Final val: " + val); // ((((10+5)-3)*2)/4)

        // ============================
        //  6. Unary Operators
        // ============================
        System.out.println("\n=== Unary Operators ===");
        int u = 10;
        System.out.println("u++ = " + (u++)); // 10 (then u becomes 11)
        System.out.println("++u = " + (++u)); // 12

        // Negation
        int z = -u;
        System.out.println("Negated u: " + z);

        // ============================
        //  7. Ternary Operator
        // ============================
        System.out.println("\n=== Ternary Operator ===");
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result: " + result);

        //  Edge case: Nested ternary
        int score = 85;
        String grade = (score >= 90) ? "A+" : (score >= 75) ? "A" : "B";
        System.out.println("Grade: " + grade);

        // ============================
        //  8. instanceof Operator
        // ============================
        System.out.println("\n=== instanceof Operator ===");
        String s = "Rahul";
        System.out.println("s instanceof String: " + (s instanceof String)); // true

        Object obj = null;
        System.out.println("null instanceof Object: " + (obj instanceof Object)); // false

        // ============================
        //  9. Shift Operators
        // ============================
        System.out.println("\n=== Shift Operators ===");
        int num = 8; // 1000
        System.out.println("num << 1 = " + (num << 1)); // 16 (adds zero to right)
        System.out.println("num >> 1 = " + (num >> 1)); // 4 (drops last bit)

        // Negative number shift
        int neg = -8;
        System.out.println("neg >> 1 = " + (neg >> 1)); // -4
        System.out.println("neg >>> 1 = " + (neg >>> 1)); // Large positive number due to unsigned shift
    }
}













