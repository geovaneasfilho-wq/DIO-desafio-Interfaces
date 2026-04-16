package funcionalidades.navegadorinter;

public class SistemaNavegadorInternet implements NavegadorInternet {
    public void exibirPagina() {
        System.out.println("Exibindo nova página (Sistema)");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba (Sistema)");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página ... (Sistema)");
    }
}
