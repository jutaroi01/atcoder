package abc.abc001;
import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int H1 = sc.nextInt();
    int H2 = sc.nextInt();
    sc.close();

    System.out.println(H1 - H2);
  }
}
