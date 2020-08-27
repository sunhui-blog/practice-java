package init;

public class Leaf {
  int i = 1;
  Leaf increment () {

    return this;
  }
  void print () {
    System.out.println("i = " + i);
  }

  public static void main(String[] args) {
    Leaf leaf = new Leaf();
    leaf.increment().increment().increment().print();
  }
}