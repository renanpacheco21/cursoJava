package horadosistema;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class ResolucaoDaTela {

    public static void main(String[] args) {

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        String msg = "A resolução da tela é: " +  +dim.width + " x " + dim.height;
        //System.out.println("A resolução da tela é: " +dim.width +" x "+ dim.height);
        JOptionPane.showMessageDialog(null,msg.toUpperCase(Locale.ROOT));
    }
}