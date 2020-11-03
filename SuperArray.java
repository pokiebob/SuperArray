public class SuperArray {

  private String[] data;
  private int size;
  private int capacity = 10;

  public SuperArray() {
    size = 0;
    data = new String[capacity];
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size >= capacity) {
      this.resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String prev = data[index];
    data[index] = element;
    return prev;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  private void resize() {
    capacity += 10;
    String[] newArray = new String[capacity];
    for (int i = 0; i < size; i++) {
      newArray[i] = data[i];
    }
    data = newArray;
  }

  public String toString() {
    String str = "[";
    for (int i = 0; i < size; i++) {
      if (data[i] != null) {
        str += data[i] + i;
        if (i < size - 1) {
          str += ", ";
        }
      }
    }
    return str + "]";
  }

  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    System.out.println(words.isEmpty());
    System.out.println(words.size());
    System.out.println(words.add("Hi"));
    System.out.println(words.size());
    System.out.println(words.get(0));
    System.out.println(words.set(0, "Hello"));
    System.out.println(words.get(0));
    words.resize();
    System.out.println(words.add("World"));
    System.out.println(words.get(10));
    System.out.println(words.toString());
  }
}
