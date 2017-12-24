package br.com.diego.padroesdeprojetos.observer;

import br.com.diego.padroesdeprojetos.builder.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota{

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviado por sms");
	}

}
