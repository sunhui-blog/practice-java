package init;

public class Flower {
  Flower () {

  }

  Flower (int i) {
    System.out.println("i = " + i);
  }

  Flower (int i, double j) {
    this(1);

    System.out.println("i = " + i + "; j = " + j);
  }

  void color () {
    // 禁止使用 this
  }

  public static void main(String[] args) {
    new Flower(2, 1.11);
  }
}