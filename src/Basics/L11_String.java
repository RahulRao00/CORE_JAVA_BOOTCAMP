package Basics;

public class L11_String {

        public static void main(String[] args) {

            //  1. STRING CREATION
            String str1 = "Java";               // string literal (String Constant Pool)
            String str2 = new String("Java");   // object in heap

            System.out.println("String Literal: " + str1);
            System.out.println("String Object: " + str2);

            //  2. == vs .equals()
            System.out.println("\n== Comparison (str1 == str2): " + (str1 == str2)); // false: reference compare
            System.out.println(".equals Comparison: " + str1.equals(str2)); // true: value compare

            //  3. IMMUTABILITY
            str1.concat(" Programming");  // Won't change str1
            System.out.println("\nAfter concat (immutability): " + str1);  // still "Java"

            str1 = str1.concat(" Programming");  // Now new object assigned
            System.out.println("After reassign: " + str1);  // "Java Programming"

            //  4. COMMON STRING METHODS
            String text = "  Hello Java!  ";
            System.out.println("\nOriginal: '" + text + "'");

            System.out.println("Trimmed: '" + text.trim() + "'");
            System.out.println("Lowercase: " + text.toLowerCase());
            System.out.println("Uppercase: " + text.toUpperCase());
            System.out.println("Length: " + text.length());
            System.out.println("Char at 2: " + text.charAt(2));
            System.out.println("Substring(2, 7): " + text.substring(2, 7));
            System.out.println("StartsWith('  He'): " + text.startsWith("  He"));
            System.out.println("EndsWith('!  '): " + text.endsWith("!  "));
            System.out.println("Index of 'Java': " + text.indexOf("Java"));
            System.out.println("Replace 'Java' with 'World': " + text.replace("Java", "World"));

            //  5. SPLIT & JOIN
            String csv = "apple,banana,grape";
            String[] fruits = csv.split(",");
            System.out.println("\nFruits from CSV:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            String joined = String.join(" | ", fruits);
            System.out.println("Joined with pipe: " + joined);

            //  6. STRINGBUILDER (MUTABLE)
            StringBuilder sb = new StringBuilder("Rahul");
            sb.append(" Kumar");
            System.out.println("\nStringBuilder (mutable): " + sb);

            //  7. EDGE CASES
            String empty = "";
            String nullStr = null;

            System.out.println("\nEmpty string length: " + empty.length()); // 0

            // Avoid calling methods on null string (throws NullPointerException)
            if (nullStr == null) {
                System.out.println("nullStr is null, skip method calls");
            }

            //  8. String Pool Behavior
            String s1 = "hello";
            String s2 = "hello";
            System.out.println("\nString Pool Behavior (s1 == s2): " + (s1 == s2)); // true (same pool)

            String s3 = new String("hello");
            System.out.println("String Object (s1 == s3): " + (s1 == s3)); // false (heap)
        }
    }




