import java.time.LocalDate;

public abstract class RecomendacaoLivro {
    private Livro livro;
    private String descricao;
    private LocalDate data;
    private Administrador admin;

    public RecomendacaoLivro(Livro livro, String descricao, LocalDate data, Administrador admin) {
        this.livro = livro;
        this.descricao = descricao;
        this.data = data;
        this.admin = admin;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
}
