
public class ReprodutorMusicalImpl implements ReprodutorMusical {
    private boolean emExecucao = false;
    private String musicaAtual;

    @Override
    public void tocar() {
        if (!emExecucao) {
            System.out.println("Iniciando a reprodução da música.");
            emExecucao = true;
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    @Override
    public void pausar() {
        if (emExecucao) {
            System.out.println("Pausando a reprodução da música.");
            emExecucao = false;
        } else {
            System.out.println("A reprodução está pausada.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
        musicaAtual = musica;
    }
}
