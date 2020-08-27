package init;

public class Bird {
  Bird (int i) {

  }

  Bird (Double i) {

  }

  public static void main(String[] args) {
    Bird bird1 = new Bird(1);
    Bird bird2 = new Bird(1.12);

    System.out.println("结果1:" + bird1); // init.Bird@2f0e140b
    System.out.println("结果2:" + bird2); // init.Bird@7440e464

    // Bird bird = new Bird() 无此构造函数
  }
}

