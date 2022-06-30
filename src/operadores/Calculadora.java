package operadores;

import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {

        //variáveis
        int calc;
        int n1;
        int n2;
        String operacao;

        //entrada de valores
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
        operacao = JOptionPane.showInputDialog("Escolha a operação (+) (-) (*) (/) :");
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número:"));

        //execução do cálculo
        switch (operacao){
            case "+":
                calc = n1 + n2;
                JOptionPane.showMessageDialog(null,"O Resultado da adição é " + calc);
                break;
            case "-":
                calc = n1 - n2;
                JOptionPane.showMessageDialog(null,"O Resultado da subtração é " + calc);
                break;
            case "*":
                calc = n1 * n2;
                JOptionPane.showMessageDialog(null,"O Resultado multiplicação é " + calc);
                break;
            case "/":
                calc = n1 / n2;
                JOptionPane.showMessageDialog(null,"O Resultado da divisão é " + calc);
                break;
            default:
                JOptionPane.showMessageDialog(null,"A operação não é válida");
        }
    }
}