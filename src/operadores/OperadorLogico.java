package operadores;

import javax.swing.*;

public class OperadorLogico {

    public static void main(String[] args) {

        /*
        && = e
        || = ou
        ^  = ou exclusivo
        !  = não
         */

        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean res;
        //res = (x<y && y<z)?true:false;
        //res = (x<y || y<z)?true:false;
        res = (x<y ^ y>z)?true:false;
        System.out.println(res);
        
        /*
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        String resIdade = (idade >= 18)?"MAIOR":"MENOR";
        JOptionPane.showMessageDialog(null, "Você é " + resIdade + " de idade");
        */

        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        String resIdade = ((idade>=16 && idade<=18) || (idade >= 70))?"OPCIONAL":"OBRIGATÓRIO";
        JOptionPane.showMessageDialog(null,"CONFORME SUA IDADE O VOTO É " + resIdade);

        //OBS: operador ternário só trás 2 opções
        //(idades menores de 16 não está verificando corretamente)

    }
}
