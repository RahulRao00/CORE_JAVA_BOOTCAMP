package Basics;

public class L2_Variables {

    // 2. Static Variable (shared by all instances)
    static String staticVar = "I am static";
    // 1. Instance Variable (defined inside class, outside methods)
    int instanceVar = 50;

    public static void main(String[] args) {
        // 3. Local Variable (defined inside method)
        int localVar = 100;
        System.out.println("Local Variable: " + localVar);

        // Access static variable directly in static context
        System.out.println("Static Variable: " + staticVar);

        // Access instance variable using object
        L2_Variables obj = new L2_Variables();
        System.out.println("Instance Variable: " + obj.instanceVar);

        // 4. Data Type Example
        byte b = 10;
        short s = 1000;
        int i = 100000;
        long l = 10000000000L;
        float f = 10.5f;
        double d = 99.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("\n--- Data Types ---");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // 5. Variable Naming Rules
        int ₹money = 500;  // valid (since ₹ is a valid Unicode character)
        int _hidden = 1;   // valid
        int $dollar = 2;   // valid
        // int 1num = 3;   // ❌ invalid: can't start with number

        System.out.println("\n--- Naming Rules ---");
        System.out.println("₹money: " + ₹money);
        System.out.println("_hidden: " + _hidden);
        System.out.println("$dollar: " + $dollar);

        // 6. Edge Case: Use without initialization
        int uninitialized;
        // System.out.println(uninitialized);  // ❌ Compile Error: variable might not have been initialized
    }

    // Example of accessing static and instance variables from a method
    void show() {
        int local = 10; // local variable
        System.out.println("Inside show(): local=" + local + ", instanceVar=" + instanceVar + ", staticVar=" + staticVar);
    }
}


