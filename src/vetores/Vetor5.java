package vetores;

import java.util.Arrays;

public class Vetor5 {

    public static void main(String[] args) {

        int num[] = new int[20];
        Arrays.fill(num,10);

        for (int val:num
             ) {
            System.out.println(num + " ");
        }
    }
}
