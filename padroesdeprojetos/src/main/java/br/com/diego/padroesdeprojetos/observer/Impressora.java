package br.com.diego.padroesdeprojetos.observer;

import br.com.diego.padroesdeprojetos.builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo nota fiscal.");
	}

}
