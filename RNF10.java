public class RNF10 {
    public static void main(String[] args) {
        String perfilUsuario = "Operador"; // Pode ser "Administrador" ou "Operador"
        String paginaSolicitada = "Configurações";

        // RNF-10: Controle de Acesso Baseado em Perfis
        if (paginaSolicitada.equals("Configurações") || paginaSolicitada.equals("Perfil e Cadastro")) {
            if (perfilUsuario.equals("Administrador")) {
                System.out.println("[RNF-10] Acesso permitido à página: " + paginaSolicitada);
            } else {
                System.out.println("[RNF-10] Acesso negado! O perfil '" + perfilUsuario + "' não tem permissão para esta seção.");
            }
        } else {
            System.out.println("Acesso livre ao Painel Geral.");
        }
    }
}