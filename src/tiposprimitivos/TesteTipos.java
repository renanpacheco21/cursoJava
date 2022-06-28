package tiposprimitivos;

public class TesteTipos {

    public static void main(String[] args) {

        //transforma de integer para string
        int idade = 20;
        String valor = Integer.toString(idade);
        System.out.println(valor + " " + valor.getClass().getSimpleName());

        //transforma de string para integer
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2 + " " + ((Object)idade2).getClass().getSimpleName());
    }
}
