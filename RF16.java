import javax.swing.*;
import java.awt.*;

public class RF16 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Cabeçalho Institucional");
        janela.setSize(500, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel cabecalho = new JPanel(new BorderLayout());
        cabecalho.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Alterado para vermelho
        cabecalho.setBackground(Color.RED); 
        // Ou usando RGB: cabecalho.setBackground(new Color(255, 0, 0));

        JLabel lblLogo = new JLabel("[ SENAI ]", JLabel.CENTER);
        lblLogo.setBackground(Color.WHITE);
        lblLogo.setForeground(Color.WHITE);
        lblLogo.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel lblTitulo = new JLabel("Sistema de Monitoramento Integrado", JLabel.CENTER);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));

        cabecalho.add(lblLogo, BorderLayout.WEST);
        cabecalho.add(lblTitulo, BorderLayout.EAST);

        janela.add(cabecalho, BorderLayout.NORTH);
        janela.setVisible(true);
    }
}