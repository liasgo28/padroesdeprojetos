package br.com.diego.padroesdeprojetos.templatemethod;

import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class RelatorioSimples {
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	protected void rodape() {
		System.out.println("(11) 1234-5678");
	}

	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getNome() + " - " + conta.getSaldo());
		}
	}
}
