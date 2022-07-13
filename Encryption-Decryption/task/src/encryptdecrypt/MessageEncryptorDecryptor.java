package encryptdecrypt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageEncryptorDecryptor {
    char[] newInput;
    private FileWriter writer;

    public void encryptDecryptText(String operation, int key, char[] input, File inputFile, File outputFile, boolean useInputFile) throws IOException {
        List<String> convertedTextWithCommas = new ArrayList<>();

        if (useInputFile) {

            if (!inputFile.isFile()) {
                System.out.println("Error: File does not exist");
                return;
            }

//            System.out.println("Reading from input file");
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                newInput = scanner.nextLine().toCharArray();
            }

            convertCharacters(operation, key, newInput, convertedTextWithCommas);
        } else {
//            System.out.println("Reading from command line argument");
            convertCharacters(operation, key, input, convertedTextWithCommas);
            // removeCommas(convertedTextWithCommas); // we can do it without this function
        }


        if (!(outputFile == null)) {

            writer = new FileWriter(outputFile);
            convertedTextWithCommas.forEach(letter -> {
                try {
                    writer.write(letter);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.close();

        } else {
            convertedTextWithCommas.forEach(System.out::print);
        }

    }

    private void convertCharacters(String operation, int key, char[] input, List<String> convertedTextWithCommas) {
        if ("enc".equals(operation)) {
            for (char character : input) {
                convertedTextWithCommas.add(String.valueOf((char) (character + key)));
            }
        } else {
            for (char character : input) {
                convertedTextWithCommas.add(String.valueOf((char) (character - key)));
            }
        }
    }

// we can do it without this function
//    private void removeCommas(List<String> convertedTextWithCommas) {
//        String convertedText = convertedTextWithCommas.toString()
//                .substring(1, 3 * convertedTextWithCommas.size() - 1)
//                .replaceAll(", ", "");
//
//        System.out.println(convertedText);
//    }
}
