package br.com.diego.padroesdeprojetos.observer;

import br.com.diego.padroesdeprojetos.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando no banco.");
	}

}
