package br.com.diego.padroesdeprojetos;

import br.com.diego.padroesdeprojetos.strategy.Conta;
import br.com.diego.padroesdeprojetos.strategy.InvestimentoArrojado;
import br.com.diego.padroesdeprojetos.strategy.InvestimentoConservador;
import br.com.diego.padroesdeprojetos.strategy.InvestimentoImpl;
import br.com.diego.padroesdeprojetos.strategy.InvestimentoModerado;
import br.com.diego.padroesdeprojetos.strategy.RealizadorDeInvestimentos;

public class RealizadorDeInvestimentosTest {
	public static void main(String[] args) {
		InvestimentoImpl arrojado = new InvestimentoArrojado();
		InvestimentoImpl conservador = new InvestimentoConservador();
		InvestimentoImpl moderado = new InvestimentoModerado();

		Conta conta = new Conta(400, "Teste", 123);

		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realizaInvestimento(conta, arrojado);
		realizadorDeInvestimentos.realizaInvestimento(conta, conservador);
		realizadorDeInvestimentos.realizaInvestimento(conta, moderado);
		
		
		
	}
}
