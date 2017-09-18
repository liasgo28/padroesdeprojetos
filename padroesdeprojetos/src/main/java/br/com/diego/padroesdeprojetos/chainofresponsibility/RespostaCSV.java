package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class RespostaCSV implements Resposta{
	Resposta proxima;
	
	public RespostaCSV(Resposta proxima){
		this.proxima = proxima;
	}
	
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.CSV)){
			System.out.println(conta.getNome() + ";" + conta.getNumero() + ";" + conta.getSaldo()); 
		}else {
			proxima.responde(req, conta);
		}	
	}

}
