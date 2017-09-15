package br.com.diego.padroesdeprojetos.strategy;

public class RealizadorDeInvestimentos {
	public void realizaInvestimento(Conta conta, InvestimentoImpl investimento) {
		double resultado = investimento.investir(conta);
        conta.deposita( resultado * 0.75 );
        System.out.println ( "Novo saldo: " + conta.getSaldo());
		
	}
}
