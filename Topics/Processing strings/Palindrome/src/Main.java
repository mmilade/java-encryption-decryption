import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String[] wordBroken = word.split("");
        List<String> newWord = new ArrayList<>();

        for (int i = wordBroken.length - 1; i >= 0; i--) {
            newWord.add(wordBroken[i]);
        }

        if (Objects.equals(Arrays.asList(wordBroken), newWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}