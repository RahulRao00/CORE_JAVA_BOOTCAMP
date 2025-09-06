package Basics;

public class L5_Conditionals {

        public static void main(String[] args) {
            // 🔹 Simple IF
            int age = 25;
            if (age >= 18) {
                System.out.println("✅ Eligible for voting.");
            }

            //  IF-ELSE
            boolean isIndian = true;
            if (isIndian) {
                System.out.println("✅ Indian citizen.");
            } else {
                System.out.println("❌ Not an Indian citizen.");
            }

            //  IF-ELSE-IF
            int marks = 75;
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else if (marks >= 80) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: C or below");
            }

            //  NESTED IF
            boolean hasID = true;
            int voteAge = 20;

            if (hasID) {
                if (voteAge >= 18) {
                    System.out.println("✅ Can vote.");
                } else {
                    System.out.println("❌ Age below 18.");
                }
            } else {
                System.out.println("❌ No valid ID.");
            }

            //  SWITCH CASE
            int day = 4;

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                case 4:
                    System.out.println("Midweek Day");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Weekend or invalid day");
            }

            //  Edge: switch without break (fall-through)
            int code = 2;
            switch (code) {
                case 1:
                    System.out.println("One");
                case 2:
                    System.out.println("Two");
                case 3:
                    System.out.println("Three");
                    break;
                default:
                    System.out.println("Unknown");
            }

            //  switch with String
            String browser = "chrome";

            switch (browser.toLowerCase()) {
                case "chrome":
                    System.out.println("Launching Chrome...");
                    break;
                case "firefox":
                    System.out.println("Launching Firefox...");
                    break;
                default:
                    System.out.println("Browser not supported.");
            }
        }
    }









