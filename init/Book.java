package init;

public class Book {
  boolean checkOut = false;
  Book (boolean out) {
    checkOut = out;
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
    new Book(true);
  }
}