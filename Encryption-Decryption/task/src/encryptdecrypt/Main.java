package encryptdecrypt;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//this is how you run this program at the end of phase 4
// edit run configuration and add the command you want to run in the program arguments like below
// -mode enc -key 5 -data "Welcome to hyperskill!"
// or java Main -key 5 -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec
// the program will put all of these arguments in an array and pick up the information it needs
// i.e. if -mode in position 0, then it will go to position 0 + 1 to pick up the mode value e.g. enc

// running it at the end of phase 5
// java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 --> expect output in protected.txt file
// java Main -mode enc -key 5 -data "Welcome to hyperskill!"
// java Main -key 5 -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec

public class Main {

    public static void main(String[] args) throws IOException {

        String mode = "enc";
        int key = 0;
        String data = "";
        File inputFile = null;
        File outputFile = null;
        boolean useFile = false;

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
            } else if (Arrays.asList(args).contains("-in")) {
                int inputFilePosition = Arrays.asList(args).indexOf("-in");
                inputFile = new File(Arrays.asList(args).get(inputFilePosition + 1));
                useFile = true;
            }

            if (Arrays.asList(args).contains("-out")) {
                int outputFilePosition = Arrays.asList(args).indexOf("-out");
                outputFile = new File(Arrays.asList(args).get(outputFilePosition + 1));
            }


        } else {

            Scanner scanner = new Scanner(System.in);
            mode = scanner.nextLine();
            data = scanner.nextLine();
            key = scanner.nextInt();

        }

        MessageEncryptorDecryptor encryptorDecryptor = new MessageEncryptorDecryptor();
        encryptorDecryptor.encryptDecryptText(mode, key, data.toCharArray(), inputFile, outputFile, useFile);
    }

}
