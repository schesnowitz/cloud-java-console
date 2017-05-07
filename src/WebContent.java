import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WebContent {
  public static void main(String[] args){ 
  /*
    String city = "Mississauga";
    String[] splitCity = city.split("s");
    
    System.out.println(Arrays.toString(splitCity));
  */
  
  /*
  String city = "Mississauga";
  String partCity = city.substring(6, 11);
  
  System.out.println(partCity);
  */
  
  String city = "Mississauga";
  Pattern p = Pattern.compile("Mi(.*?)ga");
  Matcher m = p.matcher(city);
  
    while(m.find()) {
      System.out.println(m.group(1));
    }
  
  }
} 



// import java.util.*;
// public class WebContent {
//     public static void main(String[] args){ 
//   String webString = "Steve x Layla x Addi x Kathy";
//   String[] splitString = webString.split(" x ");
  
//   System.out.println(Arrays.toString(splitString));

//   }
// }