public class factorial {
  public static void main(String[] args) {
    int num = 5;
    int f = 1;
    while (num > 0) {
      f = f * num;
      num--;
    }
    System.out.println(f);
  }
}
