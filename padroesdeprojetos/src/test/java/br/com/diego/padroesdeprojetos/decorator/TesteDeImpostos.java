package br.com.diego.padroesdeprojetos.decorator;

import br.com.diego.padroesdeprojetos.strategy.ICMS;
import br.com.diego.padroesdeprojetos.strategy.ISS;
import br.com.diego.padroesdeprojetos.strategy.Imposto;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class TesteDeImpostos {
	public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS(new ImpostoMuitoAlto()));

        Orcamento orcamento = new Orcamento(500.0);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }
}
