import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayList<String> inputList = new ArrayList<>();
        Collections.addAll(inputList, input);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> absolutes = new ArrayList<>();
        ArrayList<Integer> closeNumbers = new ArrayList<>();

        for (String element : inputList) {
            numbers.add(Integer.parseInt(element));
        }

        Collections.sort(numbers);

        int n = scanner.nextInt();

        for (int number : numbers) {
            absolutes.add(Math.abs(n - number));
        }

        Collections.sort(absolutes);

        for (int number : numbers) {
            if (Math.abs(n - number) == absolutes.get(0)) {
                closeNumbers.add(number);
            }
        }

        closeNumbers.forEach(number -> System.out.print(number + " "));

    }
}