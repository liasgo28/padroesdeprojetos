package br.com.diego.padroesdeprojetos.builder;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.padroesdeprojetos.observer.AcaoAposGerarNota;
import br.com.diego.padroesdeprojetos.observer.EnviadorDeEmail;
import br.com.diego.padroesdeprojetos.observer.EnviadorDeSms;
import br.com.diego.padroesdeprojetos.observer.Impressora;
import br.com.diego.padroesdeprojetos.observer.NotaFiscalDao;
import br.com.diego.padroesdeprojetos.strategy.Item;

public class Teste {
	public static void main(String[] args) {
List<AcaoAposGerarNota> listaAcoes = new ArrayList<AcaoAposGerarNota>();
		
        listaAcoes.add(new EnviadorDeEmail());
        listaAcoes.add(new NotaFiscalDao());
        listaAcoes.add(new EnviadorDeSms());
        listaAcoes.add(new Impressora());
        
		NotaFiscal nf = new NotaFiscalBuilder(listaAcoes).paraEmpresa("Caelum")
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
