import java.time.LocalDate;

public class RecomendacaoLivroFavorito extends  RecomendacaoLivro{
    public RecomendacaoLivroFavorito(Livro livro, String descricao, LocalDate dataCriacaoRecomendacao) {
        super(livro, descricao, dataCriacaoRecomendacao);
    }
}
