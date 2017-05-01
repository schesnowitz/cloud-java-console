import java.util.*;



public class ListOfCountries {
  public static void main(String[] args){
    
    
    List countries = new ArrayList();
    
    countries.add("Canada");
    countries.add("United States");
    countries.add("Mexico");
    
    System.out.println("NAFTA contains three trading partners that include " + countries.toString() +
    " US President Trump is looking to remove the " + countries.get(1) + " from the list which would leave " + countries.get(0) + " and " + countries.get(2));
  }
}