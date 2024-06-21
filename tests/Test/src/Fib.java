import java.util.Scanner;
public class Fib{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for(int i = 0; i < n - 2; i++){
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
