import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RF17 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Relógio do Sistema");
        janela.setSize(300, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new FlowLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(30, 10, 10, 10));

        JLabel lblHora = new JLabel();
        lblHora.setFont(new Font("Arial", Font.BOLD, 22));

        Timer timer = new Timer(1000, e -> {
            LocalTime agora = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            lblHora.setText(agora.format(formatter));
        });
        timer.start();

        painel.add(new JLabel("Hora Atual: "));
        painel.add(lblHora);

        janela.add(painel);
        janela.setVisible(true);
    }
}