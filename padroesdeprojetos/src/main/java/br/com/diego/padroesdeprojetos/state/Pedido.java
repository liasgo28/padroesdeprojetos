package br.com.diego.padroesdeprojetos.state;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Item;

public class Pedido {

	public static final int NO_CARRINHO = 1;
	public static final int PEDIDO_REALIZADO = 2;
	public static final int EM_APROVACAO = 3;
	public static final int APROVADO = 4;
	public static final int REPROVADO = 5;
	public static final int FINALIZADO = 6;

	private List<Item> itens;
	private double valorTotal;
	private int situacaoAtual;

	public Pedido(double valorTotal) {
		this.valorTotal = valorTotal;
		itens = new ArrayList<Item>();
		situacaoAtual = NO_CARRINHO;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getSituacaoAtual() {
		return situacaoAtual;
	}

	public void setSituacaoAtual(int situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}

	public void aplicaDescontoExtra() {
		if (situacaoAtual == NO_CARRINHO) {
			valorTotal = valorTotal - (valorTotal * 0.1);		
		}else if (situacaoAtual == PEDIDO_REALIZADO) {
			valorTotal = valorTotal - (valorTotal * 0.07);
		}else if (situacaoAtual == EM_APROVACAO) {
			valorTotal = valorTotal - (valorTotal * 0.05);
		} else if (situacaoAtual == APROVADO) {
			valorTotal = valorTotal - (valorTotal * 0.02);
		} else if (situacaoAtual == REPROVADO || situacaoAtual == FINALIZADO) {
			throw new RuntimeException("Pedidos reprovados ou finalizados não recebem desconto extra!");
		}
	}
}
