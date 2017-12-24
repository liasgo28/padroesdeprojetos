package br.com.diego.padroesdeprojetos.templatemethod;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Item;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return this.existemDoisItensComMesmoNome(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

	private boolean existemDoisItensComMesmoNome(Orcamento orcamento){
		List<Item> itensTemp = new ArrayList<Item>();
		for (Item item : orcamento.getItens()) {
			if (itensTemp.contains(item)){
				return true;
			}
			itensTemp.add(item);
		}
		return false;
	}
}
