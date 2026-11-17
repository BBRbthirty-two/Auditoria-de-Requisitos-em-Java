import javax.swing.*;
import java.awt.*;
public class RF7 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Taxa de acerto");
        janela.setSize(300, 180);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Taxa de Acerto (Separação por Cor):", JLabel.CENTER);
        JLabel lblTaxa = new JLabel("98.5%", JLabel.CENTER);
        lblTaxa.setFont(new Font("Arial", Font.BOLD, 18));

        painel.add(lblTitulo);
        painel.add(lblTaxa);

        janela.add(painel);
        janela.setVisible(true);
    }
}