package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class DescontoPorMaisDeCincoItens implements DescontoImpl {
	private DescontoImpl proximo;

	public double desconto(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.desconto(orcamento);
	}

	public void setProximo(DescontoImpl desconto) {
		this.proximo = desconto;
		
	}

}
