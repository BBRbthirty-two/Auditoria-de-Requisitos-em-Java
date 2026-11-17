import javax.swing.*;
import java.awt.*;

public class RF3 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Status do Programa");
        janela.setSize(300, 180);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Programa de Controle:", JLabel.CENTER);
        JLabel lblStatus = new JLabel("Habilitado", JLabel.CENTER);
        lblStatus.setFont(new Font("Arial", Font.BOLD, 16));
        lblStatus.setForeground(new Color(0, 128, 0)); // Verde para Habilitado

        painel.add(lblTitulo);
        painel.add(lblStatus);

        janela.add(painel);
        janela.setVisible(true);
    }
}