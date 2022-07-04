package horadosistema;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio);

        String anoNasc = JOptionPane.showInputDialog("Digite o ano de nascimento: ");
        Calendar calendario = Calendar.getInstance();
        int idade = calendario.get(Calendar.YEAR) - Integer.parseInt(anoNasc);
        System.out.println(idade);
        int anoNasci = Integer.parseInt(anoNasc);

        if(anoNasci >= 1 && anoNasci <= 2023){
            JOptionPane.showMessageDialog(null,"Você tem "+ idade + " anos");
        }else {
            JOptionPane.showMessageDialog(null, "O valor informado não é válido");
        }
    }
}


