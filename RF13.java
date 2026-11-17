import javax.swing.*;
import java.awt.*;

public class RF13 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Disponibilidade Mecânica");
        janela.setSize(300, 180);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Disponibilidade Mecânica:", JLabel.CENTER);
        JLabel lblDisp = new JLabel("96.4%", JLabel.CENTER);
        lblDisp.setFont(new Font("Arial", Font.BOLD, 20));

        painel.add(lblTitulo);
        painel.add(lblDisp);

        janela.add(painel);
        janela.setVisible(true);
    }
}