import java.util.Scanner;

public class exe497 {

    // Função para verificar se é palíndromo
    public static boolean ehPalindromo(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é palíndromo.");
        } else {
            System.out.println(palavra + " não é palíndromo.");
        }

        sc.close();
    }
}
