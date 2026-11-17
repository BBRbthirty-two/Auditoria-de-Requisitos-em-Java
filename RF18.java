import javax.swing.*;
import java.awt.*;

public class RF18 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Central de Notificações");
        janela.setSize(350, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel barraSuperior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnNotificacao = new JButton("🔔 Notificações (3)");

        btnNotificacao.addActionListener(e -> 
            JOptionPane.showMessageDialog(janela, "Ultimas notificações:\n- Aviso de manutenção preventiva\n- Alerta de temperatura do robô\n- Atualização de software disponível")
        );

        barraSuperior.add(btnNotificacao);

        janela.add(barraSuperior, BorderLayout.NORTH);
        janela.setVisible(true);
    }
}