import java.util.*;

public class ArrList {
  public static void main(String[] args){
    
    List list = new ArrayList();
    
    list.add(2);
    list.add(4);
    list.add(7);
    
    
    list.remove(2); // now list.add(4) does not exist and so it would "skip" to list.add(7)
    
    // System.out.println(list.get(2));
    System.out.println(list.toString());
  }
}