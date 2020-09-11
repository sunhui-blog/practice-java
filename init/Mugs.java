package init;

class Mug {
  Mug (int marker) {
    System.out.println("Mug(" + marker + ")");
  }
}

public class Mugs {
  Mug mug1;
  Mug mug2;
  {
    mug1 = new Mug(1);
    mug2 = new Mug(2);
  }

  Mugs () {
    System.out.println("Mugs");
  }

  Mugs (int marker) {
    System.out.println("Mugs(" + marker  + ")");
  }

  public static void main(String[] args) {
    System.out.println("initalize main");
    new Mugs();
    System.out.println("finish 1");
    new Mugs(1);
    System.out.println("finish 2");

  }
}