public class LoopsWhileFor {
  public static void main(String[] args){
    
    int x = 1;
    
    while (x <= 10) {
      System.out.println("X " + x);
      
      // x = x +1;
      x++;
    }
    
    for (int y = 1; y <= 10; y++)
    System.out.println("Y " + y);
  }
}