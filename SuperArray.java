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

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    data[index] = element;
    return element;
  }

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    System.out.println(words.size());
    if (words.add("Hi")) {
      System.out.println(words.size());
      System.out.println(words.get(0));
    }
    System.out.println(words.set(0, "Hello"));
    System.out.println(words.get(0));
  }
}
