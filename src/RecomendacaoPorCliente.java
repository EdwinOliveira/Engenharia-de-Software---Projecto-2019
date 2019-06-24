import java.util.ArrayList;

public class RecomendacaoPorCliente {
    private ArrayList<RecomendacaoLivroFavorito> list_RecomendacaoLivroFavorito = new ArrayList<>();
    private Utilizador utilizador;
    private ArrayList<RecomendacaoLivroPromocao> getList_RecomendacaoLivroPromocao = new ArrayList<>();

    public RecomendacaoPorCliente(ArrayList<RecomendacaoLivroFavorito> list_RecomendacaoLivroFavorito, Utilizador utilizador, ArrayList<RecomendacaoLivroPromocao> getList_RecomendacaoLivroPromocao) {
        this.list_RecomendacaoLivroFavorito = list_RecomendacaoLivroFavorito;
        this.utilizador = utilizador;
        this.getList_RecomendacaoLivroPromocao = getList_RecomendacaoLivroPromocao;
    }

    public ArrayList<RecomendacaoLivroFavorito> getList_RecomendacaoLivroFavorito() {
        return list_RecomendacaoLivroFavorito;
    }

    public void setList_RecomendacaoLivroFavorito(ArrayList<RecomendacaoLivroFavorito> list_RecomendacaoLivroFavorito) {
        this.list_RecomendacaoLivroFavorito = list_RecomendacaoLivroFavorito;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public ArrayList<RecomendacaoLivroPromocao> getGetList_RecomendacaoLivroPromocao() {
        return getList_RecomendacaoLivroPromocao;
    }

    public void setGetList_RecomendacaoLivroPromocao(ArrayList<RecomendacaoLivroPromocao> getList_RecomendacaoLivroPromocao) {
        this.getList_RecomendacaoLivroPromocao = getList_RecomendacaoLivroPromocao;
    }
}
