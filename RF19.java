import javax.swing.*;
import java.awt.*;

public class RF19 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Perfil do Usuário e Logout");
        janela.setSize(350, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 20));

        JLabel lblAvatar = new JLabel("👤 [ Operador 01 ]");
        JButton btnSair = new JButton("Sair");

        btnSair.addActionListener(e -> {
            JOptionPane.showMessageDialog(janela, "Sessão encerrada com sucesso.");
            System.exit(0);
        });

        painel.add(lblAvatar);
        painel.add(btnSair);

        janela.add(painel);
        janela.setVisible(true);
    }
}