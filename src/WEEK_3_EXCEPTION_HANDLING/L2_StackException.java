package WEEK_3_EXCEPTION_HANDLING;

class Demo {

    // this will create stackOverflowException due to infinite recursion 
    // this is going through when the stack is over 
    void fun() {
        System.out.println("Some");
        fun();
    }
}


public class L2_StackException {

    public static void main(String[] args) {
        
        Demo d = new Demo();
         d.fun();
      

    }

}
