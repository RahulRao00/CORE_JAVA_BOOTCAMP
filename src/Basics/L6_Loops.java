package Basics;

public class L6_Loops {

        public static void main(String[] args) {

            //  FOR LOOP
            for (int i = 1; i <= 5; i++) {
                System.out.println("for i = " + i);
            }

            //  WHILE LOOP
            int count = 3;
            while (count > 0) {
                System.out.println("while count = " + count);
                count--;
            }

            //  DO-WHILE LOOP
            int num = 2;
            do {
                System.out.println("do-while num = " + num);
                num--;
            } while (num > 0);

            //  BREAK STATEMENT
            for (int i = 1; i <= 5; i++) {
                if (i == 3) break;
                System.out.println("break i = " + i);
            }

            //  CONTINUE STATEMENT
            for (int i = 1; i <= 5; i++) {
                if (i == 2) continue;
                System.out.println("continue i = " + i);
            }

            //  RETURN IN LOOP
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside loop, i = " + i);
                if (i == 2) {
                    System.out.println("Returning from method!");
                    return;
                }
            }

            //  LABELLED LOOP
            outer:
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= 3; j++) {
                    if (i == 2 && j == 2) {
                        break outer;
                    }
                    System.out.println("i = " + i + ", j = " + j);
                }
            }

            //  INFINITE LOOP (commented for safety)
        /*
        while (true) {
            System.out.println("This runs forever...");
        }
        */
        }
    }






