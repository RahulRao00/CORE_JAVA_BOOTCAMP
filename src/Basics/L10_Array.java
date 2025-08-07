package Basics;

import java.util.Arrays;

public class L10_Array {
        public static void main(String[] args) {



            // 🔹 1. DECLARING AND INITIALIZING 1D ARRAY
            int[] numbers = {10, 20, 30, 40, 50};

            System.out.println("1D Array (for loop):");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }

            System.out.println("\n1D Array (for-each loop):");
            for (int num : numbers) {
                System.out.println("Value: " + num);
            }

            // 🔹 2. DYNAMIC ARRAY CREATION
            int[] arr = new int[5]; // default 0s
            arr[0] = 99;
            arr[1] = 100;

            System.out.println("\nDynamic array with default values:");
            System.out.println(Arrays.toString(arr));

            // 🔹 3. 2D ARRAY STATIC INIT
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            System.out.println("\n2D Array:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // 🔹 4. 2D ARRAY DYNAMIC INIT
            int[][] dynamic2D = new int[2][3]; // 2 rows, 3 columns
            dynamic2D[0][0] = 10;
            dynamic2D[1][2] = 20;

            System.out.println("\n2D Dynamic Array:");
            for (int[] row : dynamic2D) {
                System.out.println(Arrays.toString(row));
            }

            // 🔹 5. ARRAY METHODS
            int[] data = {5, 2, 9, 1, 6};
            Arrays.sort(data);
            System.out.println("\nSorted array: " + Arrays.toString(data));

            int[] copied = Arrays.copyOf(data, 3);
            System.out.println("Copied array (first 3): " + Arrays.toString(copied));

            int[] filled = new int[5];
            Arrays.fill(filled, 7);
            System.out.println("Filled array: " + Arrays.toString(filled));

            // 🔹 6. EDGE CASE: OUT OF BOUNDS
            try {
                int val = data[10]; // ⚠️ will throw exception
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\n❌ Exception: " + e);
            }

            // 🔹 7. DEFAULT VALUES
            String[] names = new String[3];
            System.out.println("\nDefault values in String array: " + Arrays.toString(names)); // [null, null, null]
        }
    }



