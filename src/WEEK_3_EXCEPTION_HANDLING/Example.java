package WEEK_3_EXCEPTION_HANDLING;

public class Example {

    public static void main(String[] args)   {

        int val = 10;

        try {
            some();
        }
        catch ( IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void some ()  {
        int[] arr = new int[5];
        arr[6] = 10;
    }

}
