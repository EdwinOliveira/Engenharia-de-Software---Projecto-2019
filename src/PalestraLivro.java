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


}
