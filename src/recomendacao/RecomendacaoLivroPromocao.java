package recomendacao;

import recomendacao.RecomendacaoLivro;

import java.time.LocalDate;
import java.util.ArrayList;
import livros.Livro;
import utilizador.Utilizador;

public class RecomendacaoLivroPromocao extends RecomendacaoLivro {
    public RecomendacaoLivroPromocao(Livro livro, String descricao, LocalDate data, ArrayList<Utilizador> list_Utilizadores) {
        super(livro, descricao, data, list_Utilizadores);
    }
}

