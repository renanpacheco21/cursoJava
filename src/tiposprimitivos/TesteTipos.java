package tiposprimitivos;

public class TesteTipos {

    public static void main(String[] args) {

        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor + " " + valor.getClass().getSimpleName());

        String valor2 = "30";
        int idade2 = Integer.parseInt(valor);
        System.out.println(idade2 + " " + ((Object)idade2).getClass().getSimpleName());

    }
}
