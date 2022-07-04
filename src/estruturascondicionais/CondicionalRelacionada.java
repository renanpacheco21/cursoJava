package estruturascondicionais;

import java.util.Calendar;
import java.util.Scanner;

public class CondicionalRelacionada {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNasc = num.nextInt();

        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);

        int idade = anoAtual - anoNasc;
        System.out.println(idade + " anos");

        if(idade < 16){
            System.out.println("Você não atigiu a idade mínima permitida");
        } else {
            if((idade >= 16 && idade < 18) || idade > 70){
                System.out.println("O voto é opcional");
            } else {
                System.out.println("O voto é obrigatório");
            }
        }
    }
}
