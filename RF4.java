import javax.swing.*;
import java.awt.*;

public class RF4 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Status da Comunicação");
        janela.setSize(300, 180);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Conexão com a Célula Robótica:", JLabel.CENTER);
        JLabel lblStatus = new JLabel("Online", JLabel.CENTER);
        lblStatus.setFont(new Font("Arial", Font.BOLD, 16));
        lblStatus.setForeground(Color.GREEN); // Verde = Online

        painel.add(lblTitulo);
        painel.add(lblStatus);

        janela.add(painel);
        janela.setVisible(true);
    }
}