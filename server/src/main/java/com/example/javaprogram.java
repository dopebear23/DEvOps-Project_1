
import java.util.*;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String s)
    {
        super(s);
    }
}
public class EXP4A {
  
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }
  static void checkAge1(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("JP LAB EXP4 A: Use try,throw and catch to throw an exception.");
    System.out.println("\nEnter your Age to continue:     " );
    int age = sc.nextInt();
    try
    {
    checkAge(age);
    }
    catch(ArithmeticException e){
        System.out.println("Exception caught. Age less than 18");        
    }
    
    System.out.println("JP LAB EXP4 B: Create Custom Exception Class.");
    System.out.println("\nEnter your Age to continue:     " );
    int age1 = sc.nextInt();
            
    try{
        checkAge1(age1);
    }
    catch(InvalidAgeException ee){
        System.out.println("Exception caught by Custom Exception Class");
    }
    
  }

    
} 
