//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello in java world"); //Add new line
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        for(int i = 0; i < 10; i++) {
            if(i == 3 || i == 4)
                continue;
            System.out.println(i);
        }
    }
}