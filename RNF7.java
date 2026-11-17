public class RNF7 {
    public static void main(String[] args) {
        String navegador = "Chrome";
        boolean usaPluginsProprietarios = false;

if ((navegador.equalsIgnoreCase("Chrome") || 
     navegador.equalsIgnoreCase("Firefox") || 
     navegador.equalsIgnoreCase("Edge")) && !usaPluginsProprietarios) {
    System.out.println("Acesso liberado: Navegador moderno compatível sem plugins proprietários[cite: 1].");
} else {
    System.out.println("Acesso negado: Utilize Chrome, Firefox ou Edge sem plugins proprietários[cite: 1].");
        }
    }
}