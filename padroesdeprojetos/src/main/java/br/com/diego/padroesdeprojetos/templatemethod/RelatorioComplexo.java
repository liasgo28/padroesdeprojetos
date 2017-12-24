package br.com.diego.padroesdeprojetos.templatemethod;

import java.util.Calendar;
import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class RelatorioComplexo {
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
	}

	protected void rodape() {
		System.out.println("banco@xyz.com.br");
		System.out.println(Calendar.getInstance().getTime());
	}

	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getNome() + " - " + conta.getNumero() + " - " + conta.getAgencia() + " - "
					+ conta.getSaldo());
		}
	}
}
