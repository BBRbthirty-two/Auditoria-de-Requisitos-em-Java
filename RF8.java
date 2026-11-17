import javax.swing.*;
import java.awt.*;

public class RF8 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Esquemático da Célula - Câmera CAM-01");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel lblCamera = new JLabel("[ STREAMING DE VÍDEO AO VIVO - CAM-01 ]", JLabel.CENTER);
        lblCamera.setFont(new Font("Arial", Font.BOLD, 12));
        lblCamera.setOpaque(true);
        lblCamera.setBackground(Color.DARK_GRAY);
        lblCamera.setForeground(Color.WHITE);

        painel.add(lblCamera, BorderLayout.CENTER);

        janela.add(painel);
        janela.setVisible(true);
    }
}