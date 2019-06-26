package recomendacao;


import utilizador.Utilizador;
import livros.Livro;
import java.time.LocalDate;
import java.util.ArrayList;

public class PalestraLivro {
    private ArrayList<Utilizador> list_Utilizadores = new ArrayList<>();;
    private LocalDate data;
    private RecomendacaoLivroFavorito livroFavorito;

    public PalestraLivro(ArrayList<Utilizador> list_Utilizadores, LocalDate data, RecomendacaoLivroFavorito livroFavorito) {
        this.list_Utilizadores = list_Utilizadores;
        this.data = data;
        this.livroFavorito = livroFavorito;
    }

    public ArrayList<Utilizador> getList_Utilizadores() {
        return list_Utilizadores;
    }

    public void setList_Utilizadores(ArrayList<Utilizador> list_Utilizadores) {
        this.list_Utilizadores = list_Utilizadores;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public RecomendacaoLivroFavorito getLivroFavorito() {
        return livroFavorito;
    }

    public void setLivroFavorito(RecomendacaoLivroFavorito livroFavorito) {
        this.livroFavorito = livroFavorito;
    }
}
