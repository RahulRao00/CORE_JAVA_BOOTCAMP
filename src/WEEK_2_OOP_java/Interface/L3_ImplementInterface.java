package WEEK_2_OOP_java.Interface;

// An interface can't implement another interface 
// because interface cant provide body to the methods 
// but interface extends another interface 


interface Interface1 {

    void some() ;
}

interface Interface2 extends Interface1 {

    @Override
    void some();

}

interface Interface3 extends Interface1 {

}


public class L3_ImplementInterface  {

    public static void main(String[] args) {



    }

}
