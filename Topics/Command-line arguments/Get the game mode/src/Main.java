import java.util.Arrays;

class Problem {
    public static void main(String[] args) {

        if (Arrays.asList(args).contains("mode")) {

            int modePosition = Arrays.asList(args).indexOf("mode");

            if (modePosition % 2 == 0) {
                String modeValue = Arrays.asList(args).get(Arrays.asList(args).indexOf("mode") + 1);
                System.out.println(modeValue);
            } else {
                System.out.println("default");
            }
        }

    }
}