
import java.util.Scanner;

public class VerficarPalindromo {
    public static void main(String[] args) {
        System.out.println("Write the word:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String cleanText = text.toLowerCase().replace(" ", "");
        String inverted = new StringBuilder(cleanText).reverse().toString();

        if (cleanText.equals(inverted)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Isn't a palindrome");
        }

        scanner.close();
    }
}
