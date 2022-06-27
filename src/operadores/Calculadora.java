package operadores;

import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {

        //variaveis
        int x = 0;
        int n1 = 0;
        int n2 = 0;
        String operacao = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
        operacao = JOptionPane.showInputDialog("Escolha a operação (+) (-) (*) (/) :");
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número:"));

        switch (operacao){
            case "+":
                x = n1 + n2;
                JOptionPane.showMessageDialog(null,"O Resultado da adição é " + x);
                break;
            case "-":
                x = n1 - n2;
                JOptionPane.showMessageDialog(null,"O Resultado da subtração é " + x);
                break;
            case "*":
                x = n1 * n2;
                JOptionPane.showMessageDialog(null,"O Resultado multiplicação é " + x);
                break;
            case "/":
                x = n1 / n2;
                JOptionPane.showMessageDialog(null,"O Resultado da divisão é " + x);
                break;
            default:
                JOptionPane.showMessageDialog(null,"A operação não é válida");
        }
    }
}
