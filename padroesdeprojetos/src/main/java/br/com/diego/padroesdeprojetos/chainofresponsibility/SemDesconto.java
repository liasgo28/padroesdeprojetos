package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class SemDesconto implements DescontoImpl {

	public double desconto(Orcamento orcamento) {		
		return 0;
	}

	public void setProximo(DescontoImpl desconto) {
		
	}

}
