package primeiroprograma;

import javax.swing.*;

public class OlaMundoJava extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JButton buttonOK;

    public OlaMundoJava() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        OlaMundoJava dialog = new OlaMundoJava();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
