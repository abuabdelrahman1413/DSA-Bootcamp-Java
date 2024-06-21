import java.util.Scanner;
public class calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Take input from user til user enter x
    while (true)
    {
      System.out.println("Enter first number: ");
      int num1 = input.nextInt();
      System.out.println("Enter second number: ");
      int num2 = input.nextInt();
      System.out.println("Enter operator: ");
      char operator = input.next().charAt(0);
      if (operator == '+') {
        System.out.println(num1 + num2);
      } else if (operator == '-') {
        System.out.println(num1 - num2);
      } else if (operator == '*') {
        System.out.println(num1 * num2);
      } else if (operator == '/') {
        System.out.println(num1 / num2);
      } else if (operator == 'x') {
        break;
      }
    }
  }
  
}
