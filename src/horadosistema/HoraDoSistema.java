package horadosistema;
import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());

        Scanner dt = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int ano = dt.nextInt();

        Calendar calendario = Calendar.getInstance();
        //System.out.println(calendario.get(Calendar.YEAR));

        int idade = calendario.get(Calendar.YEAR) - ano;
        System.out.println("Você tem "+ idade + " anos");

    }

}
