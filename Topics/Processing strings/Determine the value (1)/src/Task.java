// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    char[] chars = {'H', 'Y', 'P', 'E', 'R', '-', 'S', 'K', 'I', 'L', 'L'};

    String string1 = chars.toString();
    System.out.println(string1);

    String string2 = String.valueOf(chars);
    System.out.println(string2);

    String string3 = new String(chars);
    System.out.println(string3);

    String stringFromChars = String.valueOf(chars);
    String[] strings = stringFromChars.split("-");

    System.out.println(strings[1]);


  }
}
