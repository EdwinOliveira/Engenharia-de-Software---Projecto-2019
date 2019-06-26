package util;

import compraLivros.EntradaNovoLivro;
import compraLivros.PropostaAquisicao;
import compraLivros.RequisicaoCompra;
import emprestimos.*;
import livros.Copia;
import livros.Livro;
import recomendacao.FeedbackLivro;
import recomendacao.PalestraLivro;
import recomendacao.RecomendacaoLivro;
import utilizador.TipoUtilizador;
import utilizador.Utilizador;

import java.util.ArrayList;


public class RepositorioMem implements Repositorio {

    ArrayList<Coima> list_Coima = new ArrayList<>();
    ArrayList<Copia> list_Copia = new ArrayList<>();
    ArrayList<Devolucao> list_Devolucao  = new ArrayList<>();
    ArrayList<Emprestimo> list_Emprestimo = new ArrayList<>();
    ArrayList<Livro> list_Livro = new ArrayList<>();
    ArrayList<Notificacao> list_Notificacao = new ArrayList<>();
    ArrayList<Requisicao> list_Requisicao = new ArrayList<>();
    ArrayList<TipoUtilizador> list_TipoUtilizador = new ArrayList<>();
    ArrayList<Encomenda> list_Encomenda = new ArrayList<>();
    ArrayList<PropostaAquisicao> list_PropostaAquisicao = new ArrayList<>();
    ArrayList<EntradaNovoLivro> list_EntradaNovoLivro = new ArrayList<>();
    ArrayList<RequisicaoCompra> list_RequisicaoCompra = new ArrayList<>();
    ArrayList<RecomendacaoLivro> list_RecomendacaoLivro = new ArrayList<>();
    ArrayList<PalestraLivro> list_PalestraLivro = new ArrayList<>();
    ArrayList<FeedbackLivro> list_FeedbackLivro = new ArrayList<>();
    ArrayList<Utilizador> list_Utilizador = new ArrayList<>();

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

    public void adicionaRecomendacaoLivro(RecomendacaoLivro recomendacaoLivro) {
        list_RecomendacaoLivro.add(recomendacaoLivro);
    }

    public void adicionaPalestraLivro (PalestraLivro palestraLivro) {
        list_PalestraLivro.add(palestraLivro);
    }

    public void adicionaFeedbackLivro (FeedbackLivro feedbackLivro) {
        list_FeedbackLivro.add(feedbackLivro);
    }

}
