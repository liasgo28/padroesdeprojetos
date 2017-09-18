package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class RespostaXML implements Resposta {

	Resposta proxima;

	public RespostaXML(Resposta proxima){
		this.proxima = proxima;
	}
	
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.XML)) {
			System.out.println("<conta><titular>" + conta.getNome() + "</titular><numero>" + conta.getNumero() + "</numero><saldo>" + conta.getSaldo()+"</saldo></conta>");
		}else {
			proxima.responde(req, conta);
		}		
	}

}
