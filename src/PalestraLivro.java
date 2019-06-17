import java.time.LocalDate;

public class PalestraLivro {
    private Funcionario funcionario;
    private LocalDate data;
    private RecomendacaoLivroFavorito recomendacaoLivroFavorito;

    public PalestraLivro(Funcionario funcionario, LocalDate data, RecomendacaoLivroFavorito recomendacaoLivroFavorito) {
        this.funcionario = funcionario;
        this.data = data;
        this.recomendacaoLivroFavorito = recomendacaoLivroFavorito;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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

}
