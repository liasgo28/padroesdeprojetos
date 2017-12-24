package br.com.diego.padroesdeprojetos.observer;

import br.com.diego.padroesdeprojetos.builder.NotaFiscal;

public interface AcaoAposGerarNota {
	void executa(NotaFiscal notaFiscal);
}

