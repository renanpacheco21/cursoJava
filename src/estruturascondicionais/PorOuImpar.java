package estruturascondicionais;

import java.util.Scanner;

public class PorOuImpar {

    public static void main(String[] args) {


        Scanner n = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int valor = n.nextInt();

        if (valor%2==0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}