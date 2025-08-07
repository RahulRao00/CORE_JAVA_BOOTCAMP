package Basics;

public class L4_WrapperClass {

        public static void main(String[] args) {

            // 🔹 1. WRAPPER CLASSES INTRO
            // Every primitive has a corresponding Wrapper class (in java.lang)
            int a = 10;
            Integer intObj = a;   // Manual boxing
            System.out.println("Integer Object: " + intObj);


            // 🔹 2. AUTOBOXING (Primitive ➜ Object)
            Integer x = 100; // int ➜ Integer
            Double y = 99.99; // double ➜ Double
            Boolean flag = true; // boolean ➜ Boolean

            System.out.println("\nAutoboxed Values:");
            System.out.println("Integer x = " + x);
            System.out.println("Double y = " + y);
            System.out.println("Boolean flag = " + flag);


            // 🔹 3. UNBOXING (Object ➜ Primitive)
            int x1 = x;  // Integer ➜ int
            double y1 = y; // Double ➜ double

            System.out.println("\nUnboxed Values:");
            System.out.println("int x1 = " + x1);
            System.out.println("double y1 = " + y1);


            // 🔹 4. COMMON METHODS OF WRAPPER CLASSES
            String numStr = "123";
            int parsed = Integer.parseInt(numStr); // String to int
            System.out.println("\nParsed String to int: " + parsed);

            int max = Integer.max(10, 20);
            System.out.println("Max of 10 and 20: " + max);

            System.out.println("Byte MIN: " + Byte.MIN_VALUE + " MAX: " + Byte.MAX_VALUE);
            System.out.println("Integer MIN: " + Integer.MIN_VALUE + " MAX: " + Integer.MAX_VALUE);


            // 🔹 5. COMPARISON: `==` vs `.equals()`
            Integer i1 = 128;
            Integer i2 = 128;

            System.out.println("\n== vs .equals():");
            System.out.println("i1 == i2: " + (i1 == i2));       // false (reference)
            System.out.println("i1.equals(i2): " + i1.equals(i2)); // true (value)

            Integer i3 = 100;
            Integer i4 = 100;
            System.out.println("i3 == i4: " + (i3 == i4));       // true (Integer cache range: -128 to 127)
            System.out.println("i3.equals(i4): " + i3.equals(i4)); // true


            // 🔹 6. EDGE CASE: NullPointerException in unboxing
            Integer nullObj = null;
            try {
                int risky = nullObj; // will throw NullPointerException
            } catch (NullPointerException e) {
                System.out.println("\n⚠️ NullPointerException caught during unboxing from null");
            }

            // 🔹 7. Conversion to other bases
            int num = 255;
            System.out.println("\nNumber conversions:");
            System.out.println("Binary: " + Integer.toBinaryString(num));
            System.out.println("Hexadecimal: " + Integer.toHexString(num));
            System.out.println("Octal: " + Integer.toOctalString(num));
        }
    }



