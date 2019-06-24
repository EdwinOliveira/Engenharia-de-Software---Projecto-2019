import java.time.LocalDate;

public class RecomendacaoLivroPromocao extends RecomendacaoLivro{
    public RecomendacaoLivroPromocao(Livro livro, String descricao, LocalDate data, Administrador admin) {
        super(livro, descricao, data, admin);
    }
}

