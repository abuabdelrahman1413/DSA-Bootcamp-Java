import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b;
        String op;
        a = input.nextInt();
        b = input.nextInt();
        op = input.next();
        if(op.equals("+"))
            System.out.println(a+b);
        else if (op.equals("-"))
            System.out.println(a-b);
        else if (op.equals("*"))
            System.out.println(a*b);
        else if (op.equals("/"))
            System.out.println(a/b);

    }
}
