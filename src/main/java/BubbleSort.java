import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o "+(i+1)+"° numero: ");
            vetor[i] = scanner.nextInt();
        }
        bubbleSortDescrescente(vetor);
        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < 5;i++){
            System.out.println((i+1) + "° numero: "+vetor[i]);
        }

    }
    public static void bubbleSortDescrescente(int[] vetor){
        int numero = vetor.length;
        boolean troca;

        do{
            troca = false;
            for (int i= 0; i < numero - 1;i++){
                if (vetor[i] <vetor[i+1]){
                    int auxilia = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = auxilia;
                    troca = true;
                }
            }
            numero--;
        }while(troca);
    }
}

