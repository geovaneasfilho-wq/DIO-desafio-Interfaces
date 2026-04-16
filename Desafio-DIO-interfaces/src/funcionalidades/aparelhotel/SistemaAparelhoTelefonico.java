package funcionalidades.aparelhotel;

public class SistemaAparelhoTelefonico implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando ... (Sistema)");
    }

    public void atender() {
        System.out.println("Atendido! (Sistema)");
    }

    public void iniciarCorreioVoz() {
        atender();
        System.out.println("Iniciando correio de voz (Sistema)");
    }
}
