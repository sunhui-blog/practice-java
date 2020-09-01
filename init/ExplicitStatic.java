package init;

class Cups {
  static Cup cup1;
  static Cup cup2;
  static {
    cup1 = new Cup(1);
    cup2 = new Cup(2);
  }
  Cups() {
    System.out.println("Cups");
  }
}

public class ExplicitStatic {
  public static void main(String[] args) {
    System.out.println("Inside main()");

    Cups.cup1.f(99);
    Cups.cup2.f(111);
  }

  // static Cups cups1 = new Cups();
  // static Cups cups2 = new Cups();
}

// 静态初始化动作只执行一次