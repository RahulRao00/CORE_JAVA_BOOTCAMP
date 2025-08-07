package Basics;

import java.util.Scanner;

public class L8_ScannerInput {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 🔹 Input: Integer
            System.out.print("Enter an integer: ");
            int intVal = sc.nextInt();
            System.out.println("Integer entered: " + intVal);

            // 🔹 Input: Float
            System.out.print("Enter a float: ");
            float floatVal = sc.nextFloat();
            System.out.println("Float entered: " + floatVal);

            // 🔹 Input: Double
            System.out.print("Enter a double: ");
            double doubleVal = sc.nextDouble();
            System.out.println("Double entered: " + doubleVal);

            // 🔹 Input: Character
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);  // charAt(0) from string input
            System.out.println("Character entered: " + ch);

            // 🔹 Input: String (single word)
            System.out.print("Enter a single-word string: ");
            String str1 = sc.next();   // stops at whitespace
            System.out.println("String entered: " + str1);

            sc.nextLine(); // 🔸 Flush the leftover newline before nextLine()

            // 🔹 Input: String (full line)
            System.out.print("Enter a full line: ");
            String str2 = sc.nextLine(); // reads full line with spaces
            System.out.println("Full line entered: " + str2);

            // 🔹 Input: Boolean
            System.out.print("Enter a boolean (true/false): ");
            boolean boolVal = sc.nextBoolean();
            System.out.println("Boolean entered: " + boolVal);

            // 🔹 Input: Long
            System.out.print("Enter a long: ");
            long longVal = sc.nextLong();
            System.out.println("Long entered: " + longVal);

            // 🔹 Input: Byte
            System.out.print("Enter a byte value (-128 to 127): ");
            byte byteVal = sc.nextByte();
            System.out.println("Byte entered: " + byteVal);

            // 🔹 Input: Short
            System.out.print("Enter a short: ");
            short shortVal = sc.nextShort();
            System.out.println("Short entered: " + shortVal);

            // 🔹 Closing scanner (good practice)
            sc.close();
        }
    }



