package br.com.diego.padroesdeprojetos.strategy;

public class InvestimentoConservador implements InvestimentoImpl{

	public double investir(Conta conta) {
		return conta.getSaldo() * 0.08;
	}

}
