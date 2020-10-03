import java.util.Scanner;
/**
 * Calculates the sum from one to user's number
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates the scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a number
    System.out.println("Please enter an integer to count down to");
    
    // Gets the integer from the user
    int num = input.nextInt();

    // declares variables
    int count = 0;
    int sum = 0;

    // Calculates the math for the user
    while(count < num){
      count = count + 1;
      sum = sum + count;
    }
    // tells the user the answer
    System.out.println("The sum from 1 - " + num + "is " + sum);

  }
}
