import java.time.LocalDate;

public abstract class RecomendarLivro {
    private Livro livro;
    private String descricao;
    private LocalDate data;

    public RecomendarLivro(Livro livro, String descricao, LocalDate data) {
        this.livro = livro;
        this.descricao = descricao;
        this.data = data;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }
}
