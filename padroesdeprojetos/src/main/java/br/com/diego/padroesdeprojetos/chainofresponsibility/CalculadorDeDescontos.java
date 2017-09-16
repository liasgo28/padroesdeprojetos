package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		DescontoImpl desconto1 = new DescontoPorMaisDeCincoItens();
		DescontoImpl desconto2 = new DescontoPorMaisDeQuinhentosReais();
		DescontoImpl desconto3 = new DescontoPorVendaCasada();
		DescontoImpl desconto4 = new SemDesconto();

		desconto1.setProximo(desconto2);
		desconto2.setProximo(desconto3);
		desconto3.setProximo(desconto4);
		
		return desconto1.desconto(orcamento);
	}
}
