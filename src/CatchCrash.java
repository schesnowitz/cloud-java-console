    import java.util.Arrays;

    public class CatchCrash{

      public static void main(String []args){
        // declares an array of integers
      int[] numbers = new int[3];
      
      
      
  try {
       for (int i = 0; i < 4; i++) {   // with 4 here we throw an error java.lang.ArrayIndexOutOfBoundsException: 3
         
            numbers [i] = i;
        }   
  }
  catch(ArrayIndexOutOfBoundsException e) {  //java.lang.ArrayIndexOutOfBoundsException: 3
  // catch(Exception e) {  // error java.lang.ArrayIndexOutOfBoundsException: 3
    
          System.out.println("Out of bounds exception"); 
      }
      
         catch(Exception e) {  // error java.lang.ArrayIndexOutOfBoundsException: 3
    
          System.out.println(e); 
      }
      
      
      System.out.println(Arrays.toString(numbers)); 
    
     }
}
