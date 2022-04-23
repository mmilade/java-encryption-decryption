// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    String str1 = "aaabbcccdaa";
    StringBuilder str2 = new StringBuilder(" ");

    for (int i = 0; i < str1.length(); i++) {
      char ch = str1.charAt(i);
      if (ch != str2.charAt(str2.length() - 1)) {
        str2.append(ch);
      }
    }

    System.out.println(str2);
  }
}
