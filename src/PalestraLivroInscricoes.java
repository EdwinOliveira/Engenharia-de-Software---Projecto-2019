import java.util.ArrayList;

public class PalestraLivroInscricoes {
    private ArrayList<Utilizador> list_Utilizadores = new ArrayList<>();
    private PalestraLivro palestraLivro;

    public PalestraLivroInscricoes(ArrayList<Utilizador> list_Utilizadores, PalestraLivro palestraLivro) {
        this.list_Utilizadores = list_Utilizadores;
        this.palestraLivro = palestraLivro;
    }

    public ArrayList<Utilizador> getList_Utilizadores() {
        return list_Utilizadores;
    }

    public void setList_Utilizadores(ArrayList<Utilizador> list_Utilizadores) {
        this.list_Utilizadores = list_Utilizadores;
    }

    public PalestraLivro getPalestraLivro() {
        return palestraLivro;
    }

    public void setPalestraLivro(PalestraLivro palestraLivro) {
        this.palestraLivro = palestraLivro;
    }
}
