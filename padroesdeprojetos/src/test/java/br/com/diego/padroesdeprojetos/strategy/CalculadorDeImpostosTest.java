package br.com.diego.padroesdeprojetos.strategy;

import br.com.diego.padroesdeprojetos.strategy.CalculadorDeImpostos;
import br.com.diego.padroesdeprojetos.strategy.ICCC;
import br.com.diego.padroesdeprojetos.strategy.ICMS;
import br.com.diego.padroesdeprojetos.strategy.ISS;
import br.com.diego.padroesdeprojetos.strategy.Imposto;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class CalculadorDeImpostosTest {

	public static void main(String[] args) {
		Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(500.0);
        
        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        // Calculando o ISS
        calculador.realizaCalculo(orcamento, iss);

        // Calculando o ICMS        
        calculador.realizaCalculo(orcamento, icms);
        

        // Calculando o ICCM        
        calculador.realizaCalculo(orcamento, iccc);
	}
}
