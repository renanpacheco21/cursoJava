package operadores;

public class ComparacaoString {

    public static void main(String[] args) {

        String nome1 = "Renan";
        String nome2 = "Renan";
        String nome3 = new String("Renan");
        String res;
        //res = (nome1==nome2)?"igual":"diferente";
        res = (nome1.equals(nome3))?"igual":"diferente"; //equals compara o conteúdos dos objetos

        System.out.println(res);

    }
}
