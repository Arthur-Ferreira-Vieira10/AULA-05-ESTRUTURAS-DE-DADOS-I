import java.util.Arrays;
import java.util.Scanner;

public class exe499 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];
        boolean preenchido = false;
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Preencher vetor");
            System.out.println("2 - Ordenar vetor");
            System.out.println("3 - Imprimir vetor");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print("Digite o elemento " + (i + 1) + ": ");
                        vetor[i] = sc.nextInt();
                    }
                    preenchido = true;
                    break;

                case 2:
                    if (preenchido) {
                        Arrays.sort(vetor);
                        System.out.println("Vetor ordenado com sucesso!");
                    } else {
                        System.out.println("Primeiro preencha o vetor.");
                    }
                    break;

                case 3:
                    if (preenchido) {
                        System.out.println("Vetor: " + Arrays.toString(vetor));
                    } else {
                        System.out.println("Vetor vazio.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
