import java.time.LocalDate;

public class PalestraLivro {
    private Funcionario funcionario;
    private LocalDate data;
    private LivroFavorito livroFavorito;

    public PalestraLivro(Funcionario funcionario, LocalDate data, LivroFavorito livroFavorito) {
        this.funcionario = funcionario;
        this.data = data;
        this.livroFavorito = livroFavorito;
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

    public LivroFavorito getLivroFavorito() {
        return livroFavorito;
    }

    public void setLivroFavorito(LivroFavorito livroFavorito) {
        this.livroFavorito = livroFavorito;
    }
}
