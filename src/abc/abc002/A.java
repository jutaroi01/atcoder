package abc.abc002;
import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    sc.close();

    System.out.println(X > Y ? X : Y);
  }
}
