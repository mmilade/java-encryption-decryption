package encryptdecrypt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String mode = "enc";
        int key = 0;
        String data = "";

        boolean commandLineArgumentModeOn = true;

        if (commandLineArgumentModeOn) {

            if (Arrays.asList(args).contains("-mode")) {
                int modePosition = Arrays.asList(args).indexOf("-mode");
                mode = Arrays.asList(args).get(modePosition + 1);
            }

            if (Arrays.asList(args).contains("-key")) {
                int keyPosition = Arrays.asList(args).indexOf("-key");
                key = Integer.parseInt(Arrays.asList(args).get(keyPosition + 1));
            }

            if (Arrays.asList(args).contains("-data")) {
                int dataPosition = Arrays.asList(args).indexOf("-data");
                data = Arrays.asList(args).get(dataPosition + 1);
            }

        } else {

            Scanner scanner = new Scanner(System.in);
            mode = scanner.nextLine();
            data = scanner.nextLine();
            key = scanner.nextInt();

        }

        MessageEncryptorDecryptor encryptorDecryptor = new MessageEncryptorDecryptor();
        encryptorDecryptor.encryptDecryptText(mode, key, data.toCharArray());

    }

}
