package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements DescontoImpl {
	private DescontoImpl proximo;
	
	public double desconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}
		return proximo.desconto(orcamento);
	}

	public void setProximo(DescontoImpl desconto) {
		this.proximo = desconto;
	}

}
