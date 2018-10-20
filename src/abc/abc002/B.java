package abc.abc002;
import java.util.Scanner;

public class B {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    String W = sc.next();
    sc.close();

    System.out.println(W.replaceAll("a", "").replaceAll("i", "").replaceAll("u", "")
        .replaceAll("e", "").replaceAll("o", ""));
  }
}
