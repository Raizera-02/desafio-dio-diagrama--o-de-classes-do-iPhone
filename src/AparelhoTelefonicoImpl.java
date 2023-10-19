
public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    private String chamadaEmAndamento = null;

    @Override
    public void ligar(String numero) {
        if (chamadaEmAndamento == null) {
            System.out.println("Ligando para " + numero);
            chamadaEmAndamento = numero;
        } else {
            System.out.println("Já existe uma chamada em andamento.");
        }
    }

    @Override
    public void atender() {
        if (chamadaEmAndamento != null) {
            System.out.println("Atendendo a chamada de " + chamadaEmAndamento);
            chamadaEmAndamento = null;
        } else {
            System.out.println("Não há chamadas para atender.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}