import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> output = new ArrayList<>();

        while (scanner.hasNext()) {
            String input = scanner.next();

            if (!"0".equals(input)) {
                try {
                    output.add(multiplyNumbersByTen(convertStringToNumber(input)));
                } catch (NumberFormatException nfe) {
                    output.add("Invalid user input: " + input);
                }

            } else {
                printOutput(output);
                return;
            }
        }

    }

    public static int convertStringToNumber(String number) {
        return Integer.parseInt(number);
    }

    public static String multiplyNumbersByTen(int number) {
        return String.valueOf(number * 10);
    }

    public static void printOutput(List<String> outputList) {
        outputList.forEach(e -> System.out.println(e));
    }
}