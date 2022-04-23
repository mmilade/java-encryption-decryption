package encryptdecrypt;

import java.util.ArrayList;
import java.util.List;

public class MessageEncryptorDecryptor {

    public void encryptDecryptText(String operation, int key, char[] input) {
        List<String> convertedTextWithCommas = new ArrayList<>();

        if ("enc".equals(operation)) {
            for (char character : input) {
                convertedTextWithCommas.add(String.valueOf((char) (character + key)));
            }
        } else {
            for (char character : input) {
                convertedTextWithCommas.add(String.valueOf((char) (character - key)));
            }
        }
        // removeCommas(convertedTextWithCommas); // we can do it without this function
        convertedTextWithCommas.forEach(letter -> System.out.print(letter));
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
