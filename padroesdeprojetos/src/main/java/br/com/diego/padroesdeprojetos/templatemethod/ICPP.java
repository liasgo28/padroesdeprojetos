package br.com.diego.padroesdeprojetos.templatemethod;

import br.com.diego.padroesdeprojetos.strategy.Imposto;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return orcamento.getValor() * 0.05;
		}
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() >= 500;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

}
