import java.util.*;

public class Classes {
  public static void main(String[] args) {
    
    class User {
      int score;
      
      public boolean hasWon() {  // method
        
        if (score >= 100) {
          
          return true;
          
        } else {
          
          return false;
          
        }
      }
    }  
      
    User bob = new User();
    
    bob.score = 100;
    
    System.out.println(bob.score);
    System.out.println(bob.hasWon()); // parenthesis because calling method

  }
}