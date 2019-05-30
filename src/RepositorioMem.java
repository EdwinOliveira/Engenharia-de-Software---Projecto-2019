import java.util.ArrayList;

public class RepositorioMem implements Repositorio{

    ArrayList<Coima> list_Coima = new ArrayList<>();
    ArrayList<Copia> list_Copia = new ArrayList<>();
    ArrayList<Devolucao> list_Devolucao  = new ArrayList<>();
    ArrayList<Emprestimo> list_Emprestimo = new ArrayList<>();
    ArrayList<Livro> list_Livro = new ArrayList<>();
    ArrayList<Notificacao> list_Notificacao = new ArrayList<>();
    ArrayList<Requisicao> list_Requisicao = new ArrayList<>();
    ArrayList<TipoUtilizador> list_TipoUtilizador = new ArrayList<>();
    ArrayList<Utilizador> list_Utilizador = new ArrayList<>();
    ArrayList<Encomenda> list_Encomenda = new ArrayList<>();
    ArrayList<PropostaAquisicao> list_PropostaAquisicao = new ArrayList<>();
    ArrayList<EntradaNovoLivro> list_EntradaNovoLivro = new ArrayList<>();
    ArrayList<RequisicaoCompra> list_RequisicaoCompra = new ArrayList<>();

    public void adicionaUtilizador(Utilizador utilizador) {
        list_Utilizador.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        list_TipoUtilizador.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao) {
        list_Requisicao.add(requisicao);
    }

    public void adicionaCopia(Copia copia) {
        list_Copia.add(copia);
    }

    public void adicionaLivro(Livro livro) {
        list_Livro.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        list_Emprestimo.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        list_Notificacao.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        list_Devolucao.add(devolucao);
    }

    public void adicionaCoima(Coima coima) {
        list_Coima.add(coima);
    }

    public void adicionaEncomenda(Encomenda encomenda) { list_Encomenda.add(encomenda);}

    public void adicionaPropostaRequisicao(PropostaAquisicao propostaAquisicao) { list_PropostaAquisicao.add(propostaAquisicao);}

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) { list_EntradaNovoLivro.add(entradaNovoLivro);}

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) { list_RequisicaoCompra.add(requisicaoCompra);}


    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
        for(Emprestimo emp:list_Emprestimo) {
            if(emp.getRequisicao() == r) {
                return emp;
            }
        }
        return null;
    }
}
