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

    public void adicionaRecomendacaoPorCliente (RecomendacaoPorCliente recomendacaoPorCliente);

}
