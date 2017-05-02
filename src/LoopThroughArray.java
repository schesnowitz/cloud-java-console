import java.util.*;
public class LoopThroughArray {
  public static void main(String[] args) {
    
    // String[] familyArray = {"Kathy", "Steve", "Addi", "Layla", "Nan"};
    
    // for (String name : familyArray) {
      
    //   System.out.println(name);
    // }
    
    List<String> familyArray = new ArrayList<String>();
    
    familyArray.add("Kathy");
    familyArray.add("Steve");
    familyArray.add("Addi");
    familyArray.add("Layla");
    familyArray.add("Nan");
    

      System.out.println(familyArray);
      
      for (String name : familyArray) {
        
        System.out.println(name);
    }

  }
}