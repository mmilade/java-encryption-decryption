import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        convertDate(date);
    }
    
    public static void convertDate(String date) {
        String[] dateParts = date.split("-");
        System.out.println(dateParts[1] + "/" + dateParts[2] + "/" + dateParts[0]);
    }
}
