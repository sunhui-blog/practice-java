package init;

public class Book {
  boolean checkOut = false;
  Book (boolean out) {
    checkOut = out;
  }

  void checkIn () {
    checkOut = false;
  }

  @Override
  protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    super.finalize();

    if (checkOut) {
      System.out.println("Error, check out!");
    }
  }

  public static void main(String[] args) {
    // Book novel = new Book(false);

    // novel.checkIn();

    new Book(true);

    System.gc(); // 触发执行finalize
  }
}