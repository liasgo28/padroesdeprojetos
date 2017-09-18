package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class SemResposta implements Resposta{

	public void responde(Requisicao req, Conta conta) {
		System.out.println("Sem resposta");
	}

}
