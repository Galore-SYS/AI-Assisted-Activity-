
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        // Problem 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total: " );
        
        int totalInput = input.nextInt();
        
        System.out.println("Enter your count: ");
        int inputCount = input.nextInt();
       
        double result = computeAverage(totalInput, inputCount);
        System.out.println("Your result is: " + result);
    }
    
    
     public static double computeAverage(int total, int count){
// You cannot do division if zero bitch.
          if (count == 0){
              return 0.0;
          }  
        // We use double because this simply just division, and in division there will be decimals involved, so to account for that we use double instead of integer data type .
         double value = total/count;
        
         return value;
                 
     
    }
}
