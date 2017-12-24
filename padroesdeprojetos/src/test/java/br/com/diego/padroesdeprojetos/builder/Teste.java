package br.com.diego.padroesdeprojetos.builder;

import br.com.diego.padroesdeprojetos.strategy.Item;

public class Teste {
	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscalBuilder().paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .comItem(new Item("item 1", 100.0))
                .comItem(new Item("item 2", 200.0))
                .comItem(new Item("item 3", 300.0))
                .comObservacoes("entregar nf pessoalmente")
                .naDataAtual()
                .constroi();
		
		System.out.println(nf);
	}
}
