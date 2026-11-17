import javax.swing.*;
import java.awt.*;

public class RF11 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Logs do Robô");
        janela.setSize(500, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lblTitulo = new JLabel("LOGS DO ROBÔ", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));

        String[] colunas = {"Timestamp", "Ação Executada"};
        Object[][] dados = {
            {"17:37:40", "Início do ciclo na Rampa 3"},
            {"17:37:42", "Peça azul identificada e separada"},
            {"17:37:45", "Atualização do contador de peças"}
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scroll = new JScrollPane(tabela);

        painel.add(lblTitulo, BorderLayout.NORTH);
        painel.add(scroll, BorderLayout.CENTER);

        janela.add(painel);
        janela.setVisible(true);
    }
}