import java.util.Arrays;
import java.util.Scanner;

public class exe495 {

    // Função para ordenar vetor de caracteres
    public static void ordenar(char[] vetor) {
        Arrays.sort(vetor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        char[] vetor = palavra.toCharArray();
        ordenar(vetor);

        System.out.println("Caracteres em ordem alfabética: " + new String(vetor));

        sc.close();
    }
}
