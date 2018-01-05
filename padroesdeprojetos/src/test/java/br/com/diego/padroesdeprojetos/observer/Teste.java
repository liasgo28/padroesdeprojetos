package br.com.diego.padroesdeprojetos.observer;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.padroesdeprojetos.builder.NotaFiscal;
import br.com.diego.padroesdeprojetos.builder.NotaFiscalBuilder;
import br.com.diego.padroesdeprojetos.strategy.Item;

public class Teste {
	public static void main(String[] args) {
	List<AcaoAposGerarNota> listaAcoes = new ArrayList<AcaoAposGerarNota>();
		
        listaAcoes.add(new EnviadorDeEmail());
        listaAcoes.add(new NotaFiscalDao());
        listaAcoes.add(new EnviadorDeSms());
        listaAcoes.add(new Impressora());
        listaAcoes.add(new Multiplicador(2));
        listaAcoes.add(new Multiplicador(3));
        listaAcoes.add(new Multiplicador(5.5));
		NotaFiscalBuilder builder = new NotaFiscalBuilder(listaAcoes);
	

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
