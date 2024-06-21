public class countN {
  public static void main(String[] args) {
    int n = 789979;
    int tmp = 0;
    int count = 0;
    while (n > 0) {
      tmp = n % 10;
      if (tmp == 9) {
        count++;
      }
      n = n / 10;
    }
    System.out.println(count);

  }
  
}
