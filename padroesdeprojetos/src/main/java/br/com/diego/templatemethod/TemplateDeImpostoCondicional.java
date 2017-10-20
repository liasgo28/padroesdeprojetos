package br.com.diego.templatemethod;

import br.com.diego.padroesdeprojetos.strategy.Imposto;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}
	
	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    public abstract double maximaTaxacao(Orcamento orcamento);
    public abstract double minimaTaxacao(Orcamento orcamento);

}
