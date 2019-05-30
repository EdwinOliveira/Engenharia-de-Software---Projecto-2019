public class FeedbackLivro {
    private Livro livro;
    private Utilizador utilizador;
    private String descricao;

    public FeedbackLivro(Livro livro, Utilizador utilizador, String descricao) {
        this.livro = livro;
        this.utilizador = utilizador;
        this.descricao = descricao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
