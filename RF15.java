import javax.swing.*;
import java.awt.*;

public class RF15 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Navegação por Sidebar");
        janela.setSize(500, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel sidebar = new JPanel(new GridLayout(3, 1, 5, 5));
        sidebar.setPreferredSize(new Dimension(150, 300));
        sidebar.setBackground(Color.LIGHT_GRAY);

        JButton btnPainel = new JButton("Painel Geral");
        JButton btnPerfil = new JButton("Perfil e Cadastro");
        JButton btnConfig = new JButton("Configurações");

        sidebar.add(btnPainel);
        sidebar.add(btnPerfil);
        sidebar.add(btnConfig);

        JPanel conteudo = new JPanel(new BorderLayout());
        conteudo.add(new JLabel("Conteúdo do Módulo Ativo", JLabel.CENTER), BorderLayout.CENTER);

        janela.add(sidebar, BorderLayout.WEST);
        janela.add(conteudo, BorderLayout.CENTER);
        janela.setVisible(true);
    }
}