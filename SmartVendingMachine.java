import java.io.IOException;
import java.util.Scanner;



public class SmartVendingMachine {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What delicious item would you like today?");
    String userInputChoice = scanner.nextLine();

    try {
      System.out.println("How many of those delicios items would you like today?");
      String userInputNum= scanner.nextLine();
      int number = Integer.parseInt(userInputNum);
      if (number <= 0 ) {
        System.out.println("Input a number greater than 0");
      } else {
        System.out.println(userInputChoice + ":" + number);
      }
    } catch (NumberFormatException e) {
      System.out.println("Please enter a number");
    }
  }
}