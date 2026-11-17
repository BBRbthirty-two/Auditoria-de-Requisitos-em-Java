import javax.swing.*;
import java.awt.*;
public class RF10 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Status de Processamento da Câmera");
        janela.setSize(320, 180);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
            painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            JLabel lblTitulo = new JLabel("Visão Computacional:", JLabel.CENTER);
            JLabel lblStatus = new JLabel("Processando", JLabel.CENTER);
            lblStatus.setFont(new Font("Arial", Font.BOLD, 16));
            lblStatus.setForeground(new Color(255, 140, 0)); 

        painel.add(lblTitulo);
        painel.add(lblStatus);

        janela.add(painel);
        janela.setVisible(true);
    }
}