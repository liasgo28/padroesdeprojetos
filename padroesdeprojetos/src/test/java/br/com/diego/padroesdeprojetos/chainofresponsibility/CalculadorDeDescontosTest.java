package br.com.diego.padroesdeprojetos.chainofresponsibility;

import br.com.diego.padroesdeprojetos.strategy.Item;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class CalculadorDeDescontosTest {
	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();

       
        
        Item lapis = new Item("LAPIS", 15.00);
        Item caneta = new Item("CANETA", 15.00);
        Item borracha = new Item("borracha", 15.00);

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adiciona(caneta);
        orcamento.adiciona(borracha);
        orcamento.adiciona(lapis);        

        double desconto = calculador.calcula(orcamento);
        
        System.out.println(desconto);
	}
}
