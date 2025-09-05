import java.util.Scanner;

public class exe470 {

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false; // 0, 1 e negativos não são primos
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        sc.close();
    }
}
