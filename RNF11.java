public class RNF11 {
    public static void main(String[] args) {
        long tempoRespostaCLP = 15; // em ms (Limite: < 20 ms)

        // RNF-11: Tempo de Resposta da Emergência
        if (tempoRespostaCLP <= 20) {
            System.out.println("[RNF-11] Comando de Emergência enviado com segurança: " + tempoRespostaCLP + " ms");
        } else {
            System.out.println("[RNF-11 CRÍTICO] Falha de tempo real! O CLP demorou muito para responder.");
        }
    }
}