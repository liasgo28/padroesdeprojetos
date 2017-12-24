package br.com.diego.padroesdeprojetos.observer;

import br.com.diego.padroesdeprojetos.builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando por e-mail.");
	}

}
