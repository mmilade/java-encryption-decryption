import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String stringToCheckFor = scanner.nextLine();
        String remainingString = string;
        int numberOfOccurrences = 0;

        while (remainingString.length() > 0) {
            if (remainingString.contains(stringToCheckFor)) {
                int startPositionOfSubString = remainingString.indexOf(stringToCheckFor);
                int endPositionOfSubString = startPositionOfSubString + stringToCheckFor.length();
                numberOfOccurrences++;
                remainingString = remainingString.substring(endPositionOfSubString);
            } else {
                remainingString = "";
            }
        }

        System.out.println(numberOfOccurrences);
    }
}