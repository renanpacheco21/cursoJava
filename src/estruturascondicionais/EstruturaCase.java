package estruturascondicionais;

import java.util.Scanner;

public class EstruturaCase {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Digite a quantidade de pontos do seu time na última rodada: ");
        int pontos = num.nextInt();
        String resultado;

        switch (pontos){
            case 1:
                resultado = "Seu time EMPATOU";
                break;
            case 3:
                resultado = "Seu time VENCEU";
                break;
            case 0:
                resultado = "Seu time PERDEU";
            break;
            default:
                resultado = "Valor inválido, digite 0, 1 ou 3";
        }
        System.out.println(resultado);
    }
}
