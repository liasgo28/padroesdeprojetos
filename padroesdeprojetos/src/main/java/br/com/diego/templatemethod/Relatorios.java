package br.com.diego.templatemethod;

import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Conta;

abstract class Relatorio {
	protected abstract void cabecalho();

	protected abstract void rodape();

	protected abstract void corpo(List<Conta> contas);

	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}
}