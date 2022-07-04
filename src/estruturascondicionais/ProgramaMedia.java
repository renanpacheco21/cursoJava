package estruturascondicionais;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = numero.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = numero.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);

        if(m >= 7){
            System.out.println("Você foi aprovado");
        }else {
            System.out.println("Você foi reprovado");
        }
    }
}
