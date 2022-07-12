package vetores;

import java.util.Arrays;

public class Vetor4 {

    public static void main(String[] args) {

        int num[] = {3, 5, 7, 2, 1, 9, 8};
        for (int v:num
             ) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(num,9);//pesquisa o número no array

        System.out.println("Encontrei o valor na posição " + p);
    }
}
