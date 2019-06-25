package recomendacao;

import java.time.LocalDate;
import java.util.ArrayList;
import livros.Livro;
import utilizador.Utilizador;

public abstract class RecomendacaoLivro {
    private Livro livro;
    private String descricao;
    private LocalDate data;
    private ArrayList<Utilizador> list_Utilizadores = new ArrayList<>();

    public RecomendacaoLivro(Livro livro, String descricao, LocalDate data, ArrayList<Utilizador> list_Utilizadores) {
        this.livro = livro;
        this.descricao = descricao;
        this.data = data;
        this.list_Utilizadores = list_Utilizadores;
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

    public ArrayList<Utilizador> getList_Utilizadores() {
        return list_Utilizadores;
    }

    public void setList_Utilizadores(ArrayList<Utilizador> list_Utilizadores) {
        this.list_Utilizadores = list_Utilizadores;
    }
}
