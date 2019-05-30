import java.time.LocalDate;

public class LivroPromocao extends RecomendacaoLivro{
    public LivroPromocao(Livro livro, String descricao, LocalDate dataCriacaoRecomendacao) {
        super(livro, descricao, dataCriacaoRecomendacao);
    }
}
