import javax.swing.*;
import java.awt.*;

public class RF12 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Eficiência OEE");
        janela.setSize(300, 180);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Eficiência Global (OEE):", JLabel.CENTER);
        JLabel lblOee = new JLabel("85%", JLabel.CENTER);
        lblOee.setFont(new Font("Arial", Font.BOLD, 20));
        lblOee.setForeground(new Color(0, 128, 0));

        painel.add(lblTitulo);
        painel.add(lblOee);

        janela.add(painel);
        janela.setVisible(true);
    }
}