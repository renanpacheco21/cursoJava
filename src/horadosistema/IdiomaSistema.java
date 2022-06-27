package horadosistema;

import javax.swing.*;
import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {

        Locale idioma = Locale.getDefault();
        String msg = ("O idioma do sistema está configurado para: ");
        //System.out.print("O idioma do sistema está configurado para: ");
        //System.out.println(idioma.getDisplayLanguage());
        JOptionPane.showMessageDialog(null, msg + idioma.getDisplayLanguage().toUpperCase(Locale.ROOT));
    }
}
