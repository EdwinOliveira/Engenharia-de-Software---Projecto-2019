import java.time.LocalDate;

public class RecomendacaoLivroFavorito extends  RecomendacaoLivro{
    public RecomendacaoLivroFavorito(Livro livro, String descricao, LocalDate data, Administrador admin) {
        super(livro, descricao, data, admin);
    }
}
