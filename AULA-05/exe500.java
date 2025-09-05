import java.util.Arrays;
import java.util.Scanner;

public class exe500 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        boolean preenchido = false;
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Preencher vetores A e B");
            System.out.println("2 - Imprimir vetores");
            System.out.println("3 - Somar vetores (A+B)");
            System.out.println("4 - Subtrair vetores (A-B)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Preenchendo vetor A:");
                    for (int i = 0; i < A.length; i++) {
                        System.out.print("A[" + i + "]: ");
                        A[i] = sc.nextInt();
                    }
                    System.out.println("Preenchendo vetor B:");
                    for (int i = 0; i < B.length; i++) {
                        System.out.print("B[" + i + "]: ");
                        B[i] = sc.nextInt();
                    }
                    preenchido = true;
                    break;

                case 2:
                    if (preenchido) {
                        System.out.println("Vetor A: " + Arrays.toString(A));
                        System.out.println("Vetor B: " + Arrays.toString(B));
                    } else {
                        System.out.println("Primeiro preencha os vetores.");
                    }
                    break;

                case 3:
                    if (preenchido) {
                        int[] soma = new int[A.length];
                        for (int i = 0; i < A.length; i++) soma[i] = A[i] + B[i];
                        System.out.println("A + B = " + Arrays.toString(soma));
                    } else {
                        System.out.println("Primeiro preencha os vetores.");
                    }
                    break;

                case 4:
                    if (preenchido) {
                        int[] sub = new int[A.length];
                        for (int i = 0; i < A.length; i++) sub[i] = A[i] - B[i];
                        System.out.println("A - B = " + Arrays.toString(sub));
                    } else {
                        System.out.println("Primeiro preencha os vetores.");
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
