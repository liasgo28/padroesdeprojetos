package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class RespostaPorFormatosTest {

	public static void main(String[] args) {
		RespostaPorFormatos respostaPorFormatos = new RespostaPorFormatos();
		Requisicao req = new Requisicao(Formato.XML);
		Conta conta = new Conta(12.4, "Teste", 123);

		respostaPorFormatos.responde(req, conta);
	}
}
