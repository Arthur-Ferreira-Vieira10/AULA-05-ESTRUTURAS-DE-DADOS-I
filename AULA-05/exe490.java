import java.util.Scanner;

public class exe490 {

    // Função para inverter número
    public static int inverterNumero(int n) {
        int invertido = 0;
        while (n > 0) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
            n /= 10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Número invertido: " + inverterNumero(numero));

        sc.close();
    }
}
