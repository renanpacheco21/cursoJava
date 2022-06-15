package primeiroprograma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JLabel olaMundo;
    private JButton buttonOK;

    public OlaMundoJava() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                olaMundo.setText("Olá mundo!!!");
            }
        });
    }

    public static void main(String[] args) {
        OlaMundoJava dialog = new OlaMundoJava();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
