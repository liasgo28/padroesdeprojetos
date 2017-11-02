package br.com.diego.padroesdeprojetos.state;

import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento{

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}
	public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está em estado de aprovação");
      }

      public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
      }

      public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
      }
}
