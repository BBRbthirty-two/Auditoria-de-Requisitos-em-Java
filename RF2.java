import javax.swing.*;
import java.awt.*;

public class RF2 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Status do Robô");
        janela.setSize(350, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblStatus = new JLabel("Operação: Rampa 3 em execução", JLabel.CENTER);
        lblStatus.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel indicador = new JPanel();
        indicador.setBackground(Color.BLUE); // Azul = Execução
        indicador.setPreferredSize(new Dimension(50, 50));

        painel.add(lblStatus);
        painel.add(indicador);
        
        janela.add(painel);
        janela.setVisible(true);
    }
}