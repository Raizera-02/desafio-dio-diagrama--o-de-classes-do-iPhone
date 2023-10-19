
public class NavegadorInternetImpl implements NavegadorInternet {
    private String paginaAtual;

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
        paginaAtual = url;
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Atualizando a página atual: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }
}
