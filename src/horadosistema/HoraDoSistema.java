package horadosistema;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());

        //Scanner dt = new Scanner(System.in);
        //System.out.print("Digite o ano de nascimento: ");
        //int ano = dt.nextInt();
        String anoNasc = JOptionPane.showInputDialog("Digite o ano de nascimento: ");

        Calendar calendario = Calendar.getInstance();
        Integer idade = calendario.get(Calendar.YEAR) - Integer.parseInt(anoNasc);

        if(Integer.parseInt(anoNasc) > 1 || Integer.parseInt(anoNasc) < 2023){
            JOptionPane.showMessageDialog(null,"Você tem "+ idade + " anos");
        }else {
            JOptionPane.showMessageDialog(null, "O valor informado não é válido");
        }



        //System.out.println("Você tem "+ idade + " anos");
        //JOptionPane.showMessageDialog(null,"Você tem "+ idade + " anos");
    }
}
