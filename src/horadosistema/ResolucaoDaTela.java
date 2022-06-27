package horadosistema;

import java.awt.*;

public class ResolucaoDaTela {

    public static void main(String[] args) {

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        System.out.println("A resolução da tela é: " +dim.width +" x "+ dim.height);
    }
}
