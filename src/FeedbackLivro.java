public class FeedbackLivro {
    private Devolucao devolucao;
    private String descricao;

    public Devolucao getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public FeedbackLivro(Devolucao devolucao, String descricao) {
        this.devolucao = devolucao;
        this.descricao = descricao;
    }
}
