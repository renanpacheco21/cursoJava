package tiposprimitivos;

import primeiroprograma.OlaMundoJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomaSwing extends JDialog{

    private JPanel JPanel;
    private JButton btnSoma;
    private JTextField txtN1;
    private JTextField txtN2;
    private JLabel lblSoma;

    public SomaSwing() {
        setContentPane(JPanel);
        setModal(true);
        getRootPane().setDefaultButton(btnSoma);
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int s = n1 + n2;
                lblSoma.setText(Integer.toString(s));
            }
        });
    }

    public static void main(String[] args) {
        SomaSwing dialog = new SomaSwing();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);

    }
}
