package br.com.diego.padroesdeprojetos.state;

import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento{

	public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

}
