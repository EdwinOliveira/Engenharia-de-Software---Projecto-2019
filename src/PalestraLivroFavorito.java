import java.time.LocalDate;

public class PalestraLivroFavorito {

    private LivroFavorito livroFavorito;
    private LocalDate dataPalestra;
    private Funcionario funcionario;

    public PalestraLivroFavorito(LivroFavorito livroFavorito, LocalDate dataPalestra, Funcionario funcionario) {
        this.livroFavorito = livroFavorito;
        this.dataPalestra = dataPalestra;
        this.funcionario = funcionario;
    }

    public LivroFavorito getLivroFavorito() {
        return livroFavorito;
    }

    public void setLivroFavorito(LivroFavorito livroFavorito) {
        this.livroFavorito = livroFavorito;
    }

    public LocalDate getDataPalestra() {
        return dataPalestra;
    }

    public void setDataPalestra(LocalDate dataPalestra) {
        this.dataPalestra = dataPalestra;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
