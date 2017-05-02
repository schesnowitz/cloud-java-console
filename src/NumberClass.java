import java.util.*;

public class NumberClass {
  public static void main(String[] args) {
    
    class Number {
      int numberValue;
      
      public boolean isPositive() {  // method
        
        if (numberValue > 0) {
          
          return true;
          
        } else {
          
          return false;
          
        }
      }
    }  
      
    Number theNumber  = new Number();
    
    theNumber.numberValue = -1;
    
    if (theNumber.isPositive()) {
    
    System.out.println("The value is: " + theNumber.numberValue + " positive");

    } else  {
    
    System.out.println("The value is: " + theNumber.numberValue + " not positive ");
 
    }
  }
}