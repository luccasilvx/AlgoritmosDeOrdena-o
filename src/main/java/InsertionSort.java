import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o "+(i+1)+"° numero: ");
            vetor[i] = scanner.nextInt();
        }

        //ordenando vetor
        for ( int i = 1; i < vetor.length; i++){
            int eleito = vetor[i];
            int elemento = i - 1;

            while( elemento >= 0 && vetor[elemento] > eleito){
                vetor[elemento + 1] = vetor[elemento];
                elemento--;
            }
            vetor[elemento + 1] = eleito;
        }

        System.out.println("Vetor Ordenado: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.println((i+1)+"° numero: "+vetor[i]);
        }
    }
}
