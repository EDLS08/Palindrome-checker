import java.text.Normalizer;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String text = scanner.nextLine();

        String normalizedText = Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .replaceAll("[^\\p{Alnum}]", "")
                .toLowerCase();

        String reversedText = new StringBuilder(normalizedText).reverse().toString();

        if (normalizedText.equals(reversedText)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}
