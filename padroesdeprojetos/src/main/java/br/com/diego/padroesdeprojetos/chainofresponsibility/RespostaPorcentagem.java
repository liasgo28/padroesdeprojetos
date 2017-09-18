package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class RespostaPorcentagem implements Resposta {

	Resposta proxima;

	public RespostaPorcentagem(Resposta proxima){
		this.proxima = proxima;
	}
	
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.PORCENTO)) {
			System.out.println(conta.getNome() + "%" + conta.getNumero() + "%" + conta.getSaldo());
		}else {
			proxima.responde(req, conta);
		}	
	}

}
