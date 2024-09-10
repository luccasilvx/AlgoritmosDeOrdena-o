import java.util.Scanner;


public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int vetor = scanner.nextInt();
        int[] array = new int[vetor];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < vetor; i++) {
            array[vetor] = scanner.nextInt();
        }

        quickSort(array, 0, vetor -1);

        System.out.println("Array Ordenado: ");
        for (int num:array){
            System.out.println(num+"");
        }
    }

    public static void quickSort(int[] array, int comeco, int fim) {
        if (comeco < fim) {
            int pi = partition(array, comeco, fim);
            quickSort(array, comeco, pi - 1);
            quickSort(array, pi + 1, fim);
        }
    }

    public static int partition(int[] array, int comeco, int fim) {
        int pivot = array[fim];
        int i = (comeco - 1);
        for (int j = comeco; j < fim; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        return i + 1;
    }

}
