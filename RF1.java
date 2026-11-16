import java.io.*;
import java.util.Scanner;
public class RF1{
        public static void main(String[] args) {
        javax.swing.JFrame janela = new javax.swing.JFrame("Botão de Emergência");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        javax.swing.JPanel painel = new javax.swing.JPanel();
        javax.swing.JButton botao = new javax.swing.JButton("PARADA DE EMERGÊNCIA");

        botao.setBackground(java.awt.Color.RED);   
        botao.setForeground(java.awt.Color.WHITE);

        painel.add(botao);
        janela.add(painel);
        janela.setVisible(true);
    }
}