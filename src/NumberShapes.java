import java.util.*;


public class NumberShapes {
  public static void main(String[] args){
    
    class Number{
      
      int number;
      
        public boolean isSquare(){
          
          double squareRoot = Math.sqrt(number);
          
          if (squareRoot == Math.floor(squareRoot)) {
            return true;
            
          } else {
            
            return false;
            
          }
        }  
      
       public boolean isTriagular(){
          int x = 1;
          
          int triagularNumber git a= 1;
          
          while(triagularNumber < number){
            
            x++;
            
            triagularNumber = triagularNumber + x;
          }
          
          if (triagularNumber == number) {
              return true;
              
          } else {
            
             return false; 
             
          }
       }

    }

    Number myNumber = new Number();
    myNumber.number = 49;

    System.out.println(myNumber.isTriagular());
        System.out.println(myNumber.isSquare());
  }
}