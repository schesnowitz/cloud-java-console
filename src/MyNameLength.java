public class MyNameLength {
  
  public static void main(String[] args) {
    
    String firstName = "Stephen";
    String lastName = "Chesnowitz";
    
    int length = firstName.length() + lastName.length();
    
    System.out.println("My first name is " + firstName + 
    " and my last is " + lastName + " My firstname contains " + firstName.length() + " letters " 
    + "and my last name contains " + lastName.length() + " letters " +
    " my first and last name contains a total of " + length + " letters");
  }
  
}  