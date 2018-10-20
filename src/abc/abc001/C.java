package abc.abc001;
import java.util.Scanner;

public class C {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int Deg = sc.nextInt();
    int Dis = sc.nextInt();
    sc.close();

    String Dir;
    if (112 < Deg && Deg <= 337) {
      Dir = "NNE";
    } else if (337 < Deg && Deg <= 562) {
      Dir = "NE";
    } else if (562 < Deg && Deg <= 787) {
      Dir = "ENE";
    } else if (787 < Deg && Deg <= 1012) {
      Dir = "E";
    } else if (1012 < Deg && Deg <= 1237) {
      Dir = "ESE";
    } else if (1237 < Deg && Deg <= 1462) {
      Dir = "SE";
    } else if (1462 < Deg && Deg <= 1687) {
      Dir = "SSE";
    } else if (1687 < Deg && Deg <= 1912) {
      Dir = "S";
    } else if (1912 < Deg && Deg <= 2137) {
      Dir = "SSW";
    } else if (2137 < Deg && Deg <= 2362) {
      Dir = "SW";
    } else if (2362 < Deg && Deg <= 2587) {
      Dir = "WSW";
    } else if (2587 < Deg && Deg <= 2812) {
      Dir = "W";
    } else if (2812 < Deg && Deg <= 3037) {
      Dir = "WNW";
    } else if (3037 < Deg && Deg <= 3262) {
      Dir = "NW";
    } else if (3262 < Deg && Deg <= 3487) {
      Dir = "NNW";
    } else {
      Dir = "N";
    }

    int W;
    if (Dis < 15) {
      Dir = "C";
      W = 0;
    } else if (Dis < 93) {
      W = 1;
    } else if (Dis < 201) {
      W = 2;
    } else if (Dis < 327) {
      W = 3;
    } else if (Dis < 477) {
      W = 4;
    } else if (Dis < 645) {
      W = 5;
    } else if (Dis < 831) {
      W = 6;
    } else if (Dis < 1029) {
      W = 7;
    } else if (Dis < 1245) {
      W = 8;
    } else if (Dis < 1467) {
      W = 9;
    } else if (Dis < 1707) {
      W = 10;
    } else if (Dis < 1959) {
      W = 11;
    } else {
      W = 12;
    }

    System.out.println(Dir + " " + W);
  }
}
