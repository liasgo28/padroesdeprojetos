package br.com.diego.templatemethod;

import br.com.diego.padroesdeprojetos.strategy.Item;
import br.com.diego.padroesdeprojetos.strategy.Orcamento;

public class TemplateDeImpostoCondicionalTest {
	
	public static void main(String[] args) {
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		IHIT ihit = new IHIT();
		
		Orcamento orcamento = new Orcamento(800);
		Item item = new Item("teste", 256.54);
		Item item2 = new Item("teste 2", 56.54);
		Item item3 = new Item("teste 3", 16.54);
		Item item4 = new Item("teste 3", 6.54);
		orcamento.adicionaItem(item);
		orcamento.adicionaItem(item2);
		orcamento.adicionaItem(item3);
		orcamento.adicionaItem(item4);
		
		double impostoIcpp = icpp.calcula(orcamento);
		double impostoIckv = ikcv.calcula(orcamento);
		double impostoIhit = ihit.calcula(orcamento);
		
		System.out.println("ICPP: " + impostoIcpp);
		System.out.println("ICKV " + impostoIckv);
		System.out.println("IHIT " + impostoIhit);
	}
	
}
