package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class RespostaPorFormatos {
	public void responde(Requisicao req, Conta conta){
		RespostaPorcentagem respostaPorcentagem = new RespostaPorcentagem(new SemResposta());
		RespostaXML respostaXML = new RespostaXML(respostaPorcentagem);
		RespostaCSV respostaCSV = new RespostaCSV(respostaXML);
		
		respostaCSV.responde(req, conta);
	}
}
