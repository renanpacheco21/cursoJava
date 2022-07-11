package vetores;
//exemplo de for each

import java.util.Arrays;

public class Vetor3 {

    public static void main(String[] args) {

        double v[] = {3.5,1.0,5.8,4.6,3.0,2.4};
        Arrays.sort(v); //ordena o array

        for (double valor:v) {
            System.out.println("O valor é " + valor);
        }
    }
}
