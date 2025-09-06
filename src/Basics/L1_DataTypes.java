package Basics;

public class L1_DataTypes {

        public static void main(String[] args) {
            //  PRIMITIVE DATA TYPES (8 types)

            // 1. byte (1 byte = 8 bits, range: -128 to 127)
            byte b = 100;
            System.out.println("byte b = " + b);

            // 2. short (2 bytes, range: -32,768 to 32,767)
            short s = 32000;
            System.out.println("short s = " + s);

            // 3. int (4 bytes, range: -2^31 to 2^31-1)
            int i = 1000000000;
            System.out.println("int i = " + i);

            // 4. long (8 bytes, range: huge!, suffix: L)
            long l = 9999999999L;
            System.out.println("long l = " + l);

            // 5. float (4 bytes, decimal, suffix: f)
            float f = 3.14f;
            System.out.println("float f = " + f);

            // 6. double (8 bytes, more precision, suffix: d or default)
            double d = 123.456789;
            System.out.println("double d = " + d);

            // 7. char (2 bytes, single character, Unicode)
            char c = 'A';
            System.out.println("char c = " + c);

            // 8. boolean (1 bit, only true/false)
            boolean flag = true;
            System.out.println("boolean flag = " + flag);


            // 🔹 NON-PRIMITIVE (Reference Types)
            String str = "Java is awesome!";
            int[] arr = {1, 2, 3};
            System.out.println("\nNon-Primitive Types:");
            System.out.println("String str = " + str);
            System.out.println("Array arr[1] = " + arr[1]);


            //  DEFAULT VALUES (class-level only, not local)
            Defaults demo = new Defaults();
            demo.printDefaults();


            //  TYPE CASTING

            // Implicit (Widening) - small to large
            int x = 10;
            long y = x; // auto converted
            System.out.println("\nImplicit Casting (int to long): " + y);

            // Explicit (Narrowing) - large to small
            double price = 99.99;
            int finalPrice = (int) price; // manually cast
            System.out.println("Explicit Casting (double to int): " + finalPrice);


            //  EDGE CASE: overflow/underflow
            byte overflow = 127;
            overflow++;  // -128 due to overflow
            System.out.println("\nOverflow Example: " + overflow);

            byte underflow = -128;
            underflow--;  // 127 due to underflow
            System.out.println("Underflow Example: " + underflow);
        }
    }

    // Used to show default values (only applicable at class-level, not in methods)
    class Defaults {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean bool;

        void printDefaults() {
            System.out.println("\n--- Default Values (Class-Level) ---");
            System.out.println("byte: " + b);
            System.out.println("short: " + s);
            System.out.println("int: " + i);
            System.out.println("long: " + l);
            System.out.println("float: " + f);
            System.out.println("double: " + d);
            System.out.println("char: [" + c + "]");
            System.out.println("boolean: " + bool);
        }
    }


