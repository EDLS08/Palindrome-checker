import java.text.Normalizer;
import java.util.Scanner;

public class VerficarPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .replaceAll("[^\\p{Alnum}]", "")
                .toLowerCase();

        String textoInvertido = new StringBuilder(textoNormalizado).reverse().toString();

        if (textoNormalizado.equals(textoInvertido)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}
