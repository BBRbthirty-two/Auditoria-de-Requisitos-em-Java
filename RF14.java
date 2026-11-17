import javax.swing.*;
import java.awt.*;

public class RF14 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Monitoramento de Peças por Cor");
        janela.setSize(350, 220);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(4, 1, 5, 5));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel lblTitulo = new JLabel("Distribuição de Peças:", JLabel.CENTER);
        JLabel lblVermelhas = new JLabel("Peças Vermelhas: 412");
        JLabel lblAzuis = new JLabel("Peças Azuis: 531");
        JLabel lblVerdes = new JLabel("Peças Verdes: 314");

        painel.add(lblTitulo);
        painel.add(lblVermelhas);
        painel.add(lblAzuis);
        painel.add(lblVerdes);

        janela.add(painel);
        janela.setVisible(true);
    }
}