import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (b + c == 0 || d == 0) {
            System.out.println("Division by zero!");
        } else {
            result = a / ((b + c) / d);
            System.out.println(result);
        }
    }
}