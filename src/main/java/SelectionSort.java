import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        // Leitura dos números
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero: ");
            vetor[i] = scanner.nextInt();
        }

        // Ordenação por seleção
        for (int i = 0; i < 14; i++) {
            int eleito = vetor[i];
            int menor = vetor[i + 1];
            int pos_menor = i + 1;

            for (int j = i + 1; j < 15; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    pos_menor = j;
                }
            }

            if (eleito > menor) {
                int auxiliar = vetor[i];
                vetor[i] = vetor[pos_menor];
                vetor[pos_menor] = auxiliar;
            }
        }

        // Exibição do vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < 15; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
