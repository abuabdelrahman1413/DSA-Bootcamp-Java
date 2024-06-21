import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the principal amount (P): ");
        Scanner input = new Scanner(System.in);
        float p = input.nextFloat();
        System.out.println("Enter the principal amount (r): ");
        float r = input.nextFloat();
        System.out.println("Enter the principal amount (t): ");
        float t = input.nextFloat();
        float i = (p*t*r) / 100;
        System.out.println("The interest is : " + i);


    }
}
