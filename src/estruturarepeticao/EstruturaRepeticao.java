package estruturarepeticao;

public class EstruturaRepeticao {

    public static void main(String[] args) {

        int cont = 0;

        while (cont < 10){
            cont++;
            if (cont == 2 || cont == 4 || cont == 6){
                continue;
            }
            if (cont == 8){
                break;
            }
            System.out.println("Passou " + cont);
        }
    }
}
