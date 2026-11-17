import javax.swing.*;
import java.awt.*;
public class RF9 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Indicador de Gravação");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(new BorderLayout());

        JLabel lblCamera = new JLabel("[ STREAMING DE VÍDEO - CAM-01 ]", JLabel.CENTER);
        lblCamera.setOpaque(true);
        lblCamera.setBackground(Color.DARK_GRAY);
        lblCamera.setForeground(Color.WHITE);
        lblCamera.setBounds(0, 0, 400, 300);

        JLabel lblRec = new JLabel("● REC", JLabel.CENTER);
        lblRec.setOpaque(true);
        lblRec.setBackground(Color.RED);
        lblRec.setForeground(Color.WHITE);
        lblRec.setFont(new Font("Arial", Font.BOLD, 12));
        lblRec.setBounds(20, 20, 70, 30);

        layeredPane.add(lblCamera, Integer.valueOf(0));
        layeredPane.add(lblRec, Integer.valueOf(1));

        janela.add(layeredPane);
        janela.setVisible(true);
    }
}