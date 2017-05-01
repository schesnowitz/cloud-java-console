import java.util.*;



public class Mapping {
  public static void main(String[] args){
    
    Map map = new HashMap();
 
    map.put("Layla" , "Addi");  // maps Daddy to Steve
    map.put("Father", "Steve");
       map.put("Mother", "Terri");
    
    map.remove("Mother"); // only need the key to remove

    // System.out.println(map.get("Layla"));  // to print out the value Addi we call the key of the key/value pair
    
    // System.out.println(map.toString());
    
        System.out.println(map.size());
  }
}