package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public interface Resposta {
	void responde(Requisicao req, Conta conta);
}
