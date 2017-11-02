package br.com.diego.padroesdeprojetos.state;

import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);
	void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);
}
