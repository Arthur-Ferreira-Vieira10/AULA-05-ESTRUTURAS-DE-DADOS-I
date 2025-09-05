import java.util.Scanner;

public class exe480 {

    // Função para verificar se um número é capicua
    public static boolean ehCapicua(int n) {
        String str = Integer.toString(n);
        String invertida = new StringBuilder(str).reverse().toString();
        return str.equals(invertida);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (ehCapicua(numero)) {
            System.out.println(numero + " é capicua.");
        } else {
            System.out.println(numero + " não é capicua.");
        }

        sc.close();
    }
}
