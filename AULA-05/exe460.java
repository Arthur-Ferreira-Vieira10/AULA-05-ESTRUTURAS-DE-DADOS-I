import java.util.Scanner;

public class exe460 {

    // Função que devolve o dobro de um número
    public static int dobro(int n) {
        return n * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        // Entrada dos três números
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        // Saída: dobro de cada número
        System.out.println("\nDobro de cada número:");
        for (int n : numeros) {
            System.out.println(n + " -> " + dobro(n));
        }

        sc.close();
    }
}
