package util;

import compraLivros.EntradaNovoLivro;
import compraLivros.PropostaAquisicao;
import compraLivros.RequisicaoCompra;
import emprestimos.*;
import livros.Copia;
import livros.Livro;
import emprestimos.FeedbackLivro;
import recomendacao.PalestraLivro;
import recomendacao.PalestraLivroInscricoes;
import recomendacao.RecomendacaoLivro;
import utilizador.TipoUtilizador;
import utilizador.Utilizador;

public interface Repositorio {

    public void adicionaTipoUtilizador(TipoUtilizador tipo);

    public void adicionaRequisicao(Requisicao requisicao);

    public void adicionaCopia(Copia copia);

    public void adicionaLivro(Livro livro);

    public void adicionaEmprestimo(Emprestimo emprestimo);

    public void adicionaNotificacao(Notificacao notificacao);

    public void adicionaDevolucao(Devolucao devolucao);

    public void adicionaCoima(Coima coima);

    public void adicionaEncomenda(Encomenda encomenda);

    public void adicionaPropostaRequisicao(PropostaAquisicao propostaAquisicao);

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

    public void adicionaRecomendacaoLivro(RecomendacaoLivro recomendacaoLivro);

    public void adicionaPalestraLivro (PalestraLivro palestraLivro);

    public void adicionaPalestraLivroInscricoes (PalestraLivroInscricoes palestraLivroInscricoes);

    public void adicionaFeedbackLivro (FeedbackLivro feedbackLivro);

    public void adicionaUtilizador(Utilizador utilizador);

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);


}
