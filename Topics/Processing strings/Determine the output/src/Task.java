// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    String str = "Hello, Java";

    int i = str.length() - 1;
    while (i >= 1) {
      System.out.print(str.charAt(i));
      i--;
    }
  }
}
