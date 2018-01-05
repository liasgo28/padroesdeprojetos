package br.com.diego.padroesdeprojetos.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.diego.padroesdeprojetos.observer.AcaoAposGerarNota;
import br.com.diego.padroesdeprojetos.strategy.Item;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorTotal;
	private double impostos;
	private double valorBruto;
	private Calendar data;
	private String observacoes;
	private List<Item> todosItens = new ArrayList<Item>();
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	public NotaFiscalBuilder(List<AcaoAposGerarNota> lista) {
		this.todasAcoesASeremExecutadas = lista;
	}

	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(notaFiscal);
		}
		return notaFiscal;
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}

	public NotaFiscalBuilder comItem(Item item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	private void enviaPorEmail(NotaFiscal notaFiscal) {
		System.out.println("enviando por e-mail");
	}

	private void salvaNoBanco(NotaFiscal notaFiscal) {
		System.out.println("salvando no banco");
	}

	private void enviaPorSms(NotaFiscal notaFiscal) {
		System.out.println("enviando por sms");
	}

	private void imprime(NotaFiscal notaFiscal) {
		System.out.println("imprimindo notaFiscal");
	}

	
}
