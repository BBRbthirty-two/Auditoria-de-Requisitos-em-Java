public class RNF6 {
    public static void main(String[] args) {
        double uptimePercentual = 99.8; // Exemplo de métrica de disponibilidade coletada

if (uptimePercentual >= 99.5) {
    System.out.println("Disponibilidade operacional dentro da meta estabelecida (" + uptimePercentual + "%)[cite: 1].");
} else {
    System.out.println("Alerta Crítico: Uptime abaixo de 99,5%. Verifique os servidores[cite: 1].");
        }
    }
}