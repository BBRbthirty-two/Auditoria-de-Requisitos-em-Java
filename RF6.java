import javax.swing.*;
import java.awt.*;

public class RF6 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Medição do Tempo de Ciclo");
        janela.setSize(300, 180);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Tempo de Ciclo por Peça:", JLabel.CENTER);
        JLabel lblTempo = new JLabel("4.2 seg", JLabel.CENTER);
        lblTempo.setFont(new Font("Arial", Font.BOLD, 18));

        painel.add(lblTitulo);
        painel.add(lblTempo);

        janela.add(painel);
        janela.setVisible(true);
    }
}