package recomendacao;

import recomendacao.RecomendacaoLivroFavorito;

import utilizador.Utilizador;
import java.time.LocalDate;

public class PalestraLivro {
    private Utilizador utilizador;
    private LocalDate data;
    private RecomendacaoLivroFavorito recomendacaoLivroFavorito;

    public PalestraLivro(Utilizador utilizador, LocalDate data, RecomendacaoLivroFavorito recomendacaoLivroFavorito) {
        this.utilizador = utilizador;
        this.data = data;
        this.recomendacaoLivroFavorito = recomendacaoLivroFavorito;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public RecomendacaoLivroFavorito getRecomendacaoLivroFavorito() {
        return recomendacaoLivroFavorito;
    }

    public void setRecomendacaoLivroFavorito(RecomendacaoLivroFavorito recomendacaoLivroFavorito) {
        this.recomendacaoLivroFavorito = recomendacaoLivroFavorito;
    }
}
