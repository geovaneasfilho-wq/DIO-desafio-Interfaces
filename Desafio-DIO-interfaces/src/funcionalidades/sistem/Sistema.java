package funcionalidades.sistem;

import funcionalidades.aparelhotel.AparelhoTelefonico;
import funcionalidades.navegadorinter.NavegadorInternet;
import funcionalidades.reprodutormusic.ReprodutorMusical;

public class Sistema implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando ... ");
    }

    public void atender() {
        System.out.println("Atendido! ");
    }

    public void iniciarCorreioVoz() {
        atender();
        System.out.println("Iniciando correio de voz ");
    }

    public void exibirPagina() {
        System.out.println("Exibindo nova página ");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba ");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página ... ");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música ");
    }

    public void tocar() {
        musicaSelecionada();
        System.out.println("Reproduzindo ... ");
    }

    public void pausar() {
        System.out.println("Reprodução pausada ");
    }

    private void musicaSelecionada() {
        System.out.println("Música selecionada");
    }

}
