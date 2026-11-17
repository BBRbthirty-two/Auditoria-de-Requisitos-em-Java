import javax.swing.*;
import java.awt.*;

public class RF5 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Contador de Peças");
        janela.setSize(300, 180);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(2, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Total de Peças Processadas:", JLabel.CENTER);
        JLabel lblContador = new JLabel("1.257 peças", JLabel.CENTER);
        lblContador.setFont(new Font("Arial", Font.BOLD, 18));

        painel.add(lblTitulo);
        painel.add(lblContador);

        janela.add(painel);
        janela.setVisible(true);
    }
}