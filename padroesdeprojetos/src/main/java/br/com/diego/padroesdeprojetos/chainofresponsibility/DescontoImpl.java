package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public interface DescontoImpl {
	double desconto(Orcamento orcamento);
	void setProximo(DescontoImpl desconto);
}
