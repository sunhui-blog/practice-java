package init;

public class Tree {
  Tree () {
    System.out.println("this is a tree");
  }

  Tree (int i) {
    System.out.println(i);
  }

  public void info () {
    System.out.println("this is a info");
  }

  public void info (int i) {
    System.out.println(i + "info");
  }

  public static void main(String[] args) {
    for (int i = 1; i < 3; i++ ) {
      Tree tree = new Tree(i);

      new Tree();

      tree.info();
      tree.info(i);
    }
  }
}