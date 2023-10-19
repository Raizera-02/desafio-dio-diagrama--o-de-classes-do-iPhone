public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public IPhone() {
        reprodutorMusical = new ReprodutorMusicalImpl();
        aparelhoTelefonico = new AparelhoTelefonicoImpl();
        navegadorInternet = new NavegadorInternetImpl();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        navegadorInternet.adicionarNovaAba(url);
    }

    @Override
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}

