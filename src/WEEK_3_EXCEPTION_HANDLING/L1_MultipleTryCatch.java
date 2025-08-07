import java.util.*;

public class L1_MultipleTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter the length of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the elements of the array :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index on which operation occur: ");
            int idx = sc.nextInt();

            System.out.print("Enter another value : ");
            int value = sc.nextInt();

            int ans = arr[idx] / value;
            System.out.println("After idx divide by value " + ans);

        } 
        catch (InputMismatchException e) {

            System.out.println("Invalid input " + e);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid index " + e);
        } catch (ArithmeticException e) {

            System.out.println("Divide by Zero Exception : " + e);

        } 
        
        // This is general Exception if any Exception not handled 
        // then this default Exception will handle all the handles 
        catch (Exception e) {

            System.out.println("Something went wrong ! ");
        }

        sc.close();
    }
}
