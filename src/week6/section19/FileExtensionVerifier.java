package week6.section19;

import java.util.Locale;

public class FileExtensionVerifier {

    public static void main(String[] args) {

        String fileExtension = "something.PdF";
        String expectedExtension = ".pdf";

        System.out.println(fileExtension.toLowerCase(Locale.ROOT).endsWith(expectedExtension));

    }
}
