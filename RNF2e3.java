public class RNF2e3 {
    public static void main(String[] args) {
        double latenciaVideo = 150.0; // em ms (Limite: < 200 ms)
        double tempoTelemetria = 80.0; // em ms (Limite: < 100 ms)

        // RNF-02: Latência do Video Streaming
        if (latenciaVideo < 200.0) {
            System.out.println("[RNF-02] Latência da Câmera OK: " + latenciaVideo + " ms");
        } else {
            System.out.println("[RNF-02 Alerta] Latência acima do limite permitido!");
        }

        // RNF-03: Atualização de Telemetria
        if (tempoTelemetria < 100.0) {
            System.out.println("[RNF-03] Telemetria atualizada com sucesso: " + tempoTelemetria + " ms");
        } else {
            System.out.println("[RNF-03 Alerta] A atraso na atualização de telemetria!");
        }
    }
}