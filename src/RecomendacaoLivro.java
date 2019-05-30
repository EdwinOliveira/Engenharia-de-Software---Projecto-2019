import java.time.LocalDate;

public abstract class RecomendacaoLivro {
    private Livro livro;
    private String descricao;
    private LocalDate data;

    public RecomendacaoLivro(Livro livro, String descricao, LocalDate dataCriacaoRecomendacao) {
        this.livro = livro;
        this.descricao = descricao;
        this.data = dataCriacaoRecomendacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacaoRecomendacao() {
        return data;
    }

    public void setDataCriacaoRecomendacao(LocalDate dataCriacaoRecomendacao) {
        this.data = dataCriacaoRecomendacao;
    }
}
