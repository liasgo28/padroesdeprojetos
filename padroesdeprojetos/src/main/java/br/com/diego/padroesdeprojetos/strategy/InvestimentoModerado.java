package br.com.diego.padroesdeprojetos.strategy;

public class InvestimentoModerado implements InvestimentoImpl {

	public double investir(Conta conta) {
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		if (escolhido){
			return conta.getSaldo() * 0.025;
		}
		return conta.getSaldo() * 0.07;
	}

}
