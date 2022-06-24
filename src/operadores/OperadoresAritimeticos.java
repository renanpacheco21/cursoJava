package operadores;

import javax.sound.midi.Soundbank;

public class OperadoresAritimeticos {

    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        float r = n2 % n1;
        System.out.println("A média é igual: " + m);
        System.out.println("O resto da divisão é igual: " + r);

        int numero = 5;
        numero++; //incremento +1
        numero--; //decremento -1
        int valor = 10 + ++numero; //pré-incremento
        System.out.println(numero);
        System.out.println(valor);

        int x = 4;
        x += 2; // += atribui x = x+2
        x -= 2; // += atribui x = x+2
        x += x;
        System.out.println(x);

        double pi = Math.PI; //valor do pi
        System.out.println(pi);
        double exp = Math.pow(5,2); //exponenciação
        System.out.println(exp);
        double raiz2 = Math.sqrt(4); //raíz quadrada
        System.out.println(raiz2);
        double raiz3 = Math.cbrt(27); //raíz cúbica
        System.out.println(raiz3);
        double x1 = Math.abs(-10);  //nº absoluto, tira o sinal negativo
        System.out.println(x1);
        double x2 = Math.floor(5.9); //arredonda para baixo = 5
        System.out.println(x2);
        double x3 = Math.ceil(4.3); //arredonda para cima = 5
        System.out.println(x3);
        Long x4 = Math.round(4.49); //arredonda corretamente = 4
        System.out.println(x4);
    }
}
