import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] wordBroken = word.split("");

        for (String letter : wordBroken) {
            System.out.print(letter);
            System.out.print(letter);
        }

    }
}