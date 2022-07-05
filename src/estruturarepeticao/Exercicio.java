package estruturarepeticao;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Exercicio {

    public static void main(String[] args) {

        int num;
        int soma = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(O valor 0 interrompe)</em></html>"));
            soma += num;
        } while (num != 0);
        JOptionPane.showMessageDialog(null,
                "<html>Resultado final <hr>" +
                "<br>O somatório vale " + soma + "</html>");
    }
}
