package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Item;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class DescontoPorVendaCasada implements DescontoImpl {
	DescontoImpl proximo;

	public double desconto(Orcamento orcamento) {
		if (existe("LAPIS", orcamento) && existe ("CANETA", orcamento)){
			return orcamento.getValor() * 0.05;
		}
		return proximo.desconto(orcamento);
	}

	public void setProximo(DescontoImpl desconto) {
		this.proximo = desconto;
	}

	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
