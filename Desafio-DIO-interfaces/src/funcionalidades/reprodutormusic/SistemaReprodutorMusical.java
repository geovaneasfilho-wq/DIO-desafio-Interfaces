package funcionalidades.reprodutormusic;

public class SistemaReprodutorMusical implements ReprodutorMusical {
    public void selecionarMusica() {
        System.out.println("Selecionando música (Sistema)");
    }

    public void tocar() {
        musicaSelecionada();
        System.out.println("Selecionando música (Sistema)");
    }

    public void pausar() {
        System.out.println("Reprodução pausada (Sistema)");
    }

    private void musicaSelecionada() {
        System.out.println("Música selecionada");
    }
}
