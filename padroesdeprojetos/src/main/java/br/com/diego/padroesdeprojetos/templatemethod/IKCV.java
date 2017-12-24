package br.com.diego.padroesdeprojetos.templatemethod;

import br.com.diego.padroesdeprojetos.strategy.Imposto;
import br.com.diego.padroesdeprojetos.strategy.Item;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{
	//á o imposto IKCV, caso o valor do orçamento seja maior que 500,00 e algum item tiver valor superior a 100,00, o imposto a ser cobrado é de 10%; caso contrário 6%.
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temAlgumItemValorMaiorCem(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;		
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	private boolean temAlgumItemValorMaiorCem(Orcamento orcamento){
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100){
				return true;
			}
		}
		return false;
	}
	
	
}
