
// class cant be abstract and final together 
// both are against each other
// because if class is final that means we cant change anything in that class 
// if class is abstract then we have to must extend provide the body to the method 
// means final -> no change  &   abstract -> change must 


abstract  class Bird {

    final int val = 10 ;
    abstract void eat();
    abstract void fly();
}


abstract class Eagle extends Bird {


}




public class L4_FinalAbstract {
    
}
