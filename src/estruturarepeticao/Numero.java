package estruturarepeticao;

import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {

        int n;
        int s = 0;
        String resp;
        Scanner num = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            n = num.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = num.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }
}
