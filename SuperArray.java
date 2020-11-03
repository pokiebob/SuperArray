public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray() {
    size = 0;
    data = new String[10];
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    data[size] = element;
    size++;
    return true;
  }

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    System.out.println(words.size());
    if (words.add("Hello")) {
      System.out.println(words.size());
    }
  }
}
