package br.com.diego.padroesdeprojetos.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.diego.padroesdeprojetos.state.EmAprovacao;
import br.com.diego.padroesdeprojetos.state.EstadoDeUmOrcamento;

public class Orcamento {

	public EstadoDeUmOrcamento estadoAtual;
	public double valor;
	private List<Item> itens;

	public Orcamento() {
		this.estadoAtual = new EmAprovacao();
	}

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();

	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public void adiciona(Item item) {
		itens.add(item);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}