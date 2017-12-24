package br.com.diego.padroesdeprojetos.observer;

import br.com.diego.padroesdeprojetos.builder.NotaFiscal;
import br.com.diego.padroesdeprojetos.builder.NotaFiscalBuilder;
import br.com.diego.padroesdeprojetos.strategy.Item;

public class Teste {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                          .comCnpj("123.456.789/0001-10")
                          .comItem(new Item("item 1", 100.0))
                          .comItem(new Item("item 2", 200.0))
                          .comItem(new Item("item 3", 300.0))
                          .comObservacoes("entregar notaFiscal pessoalmente")
                          .naDataAtual()
                          .constroi();
        
        System.out.println(notaFiscal);
	}
}
