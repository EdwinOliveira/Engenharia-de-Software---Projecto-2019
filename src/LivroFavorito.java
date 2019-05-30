import java.time.LocalDate;

public class LivroFavorito extends  RecomendacaoLivro{
    public LivroFavorito(Livro livro, String descricao, LocalDate dataCriacaoRecomendacao) {
        super(livro, descricao, dataCriacaoRecomendacao);
    }
}
