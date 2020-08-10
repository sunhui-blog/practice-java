package construct.tree;

public class Tree {
  Tree () {
    System.out.println("the tree");
  }

  Tree (int i) {
    System.out.println("the tree node:" + i);
  }

  Tree (int i, String name) {
    System.out.println("the tree node:" + i + ",the tree name:" + name);
  }

  public static void main(String[] args) {
    new Tree(); // output: the tree
    new Tree(10); // output: the tree node:10
    new Tree(15, "梧桐"); // output: the tree node:15,the tree name:梧桐
  }
}

