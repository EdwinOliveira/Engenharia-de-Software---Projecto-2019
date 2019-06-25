import java.time.LocalDate;
import java.util.ArrayList;

public class RecomendacaoLivroFavorito extends  RecomendacaoLivro{
    public RecomendacaoLivroFavorito(Livro livro, String descricao, LocalDate data, ArrayList<Utilizador> list_Utilizadores) {
        super(livro, descricao, data, list_Utilizadores);
    }
}
