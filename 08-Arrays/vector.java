public class Vector {
  public static void main(String[] args) {
    // Create a vector
    Vector<Integer> v = new Vector<Integer>();

    // Insert elements in the Vector
    v.add(1);
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(3);
    v.remove(2);

    // Print the Vector
    System.out.println("Vector is " + v);
  }
}
