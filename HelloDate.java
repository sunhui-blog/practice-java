import java.util.*;

public class HelloDate {
  public static void main(String[] args) {
    System.out.println(new Date()); // Fri Jul 24 14:10:57 CST 2020
    int a = 3;
    int b = 2;
    // 优先级 先乘除后加减
    int c = a * b + 20;
    // 括号优先级 最高

    int d = a * (b + 20);
    System.out.println(a + b);
    System.out.println(c);
    System.out.println(d);

    boolean e = false;
    System.out.println(e);

    // 窄运算
    long f = (int)1000000;
    System.out.println(f);


    int i = 0;
    while (i < 4) {
      i++;
      System.out.println(i);
    }
  }
}