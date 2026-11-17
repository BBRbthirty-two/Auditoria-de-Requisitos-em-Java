public class RNF8 {
    public static void main(String[] args) {
        String statusOperacional = "Execução"; // Ex: Normal, Execução, Parada

        // RNF-08: Codificação Visual por Cores
        switch (statusOperacional) {
            case "Normal":
            case "Online":
                System.out.println("[RNF-08] Status: " + statusOperacional + " -> Cor da Interface: VERDE");
                break;
            case "Execução":
                System.out.println("[RNF-08] Status: " + statusOperacional + " -> Cor da Interface: AZUL");
                break;
            case "Parada":
            case "Erro":
                System.out.println("[RNF-08] Status: " + statusOperacional + " -> Cor da Interface: VERMELHO");
                break;
            default:
                System.out.println("Status desconhecido.");
        }
    }
}