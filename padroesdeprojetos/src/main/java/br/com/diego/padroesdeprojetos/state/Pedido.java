package br.com.diego.padroesdeprojetos.state;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Item;

public class Pedido {

	private List<Item> itens;
	private double valorTotal;
	private EstadoDeUmPedido situacaoAtual;

	public Pedido(double valorTotal) {
		this.valorTotal = valorTotal;
		itens = new ArrayList<Item>();
		situacaoAtual = new PedidoNoCarrinho();
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
	
	public void aplicaDescontoExtra() {
		situacaoAtual.aplicaDescontoExtra(this);
	}

	public void proximoEstado() {
		situacaoAtual.aplicaDescontoExtra(this);
	}

	public EstadoDeUmPedido getSituacaoAtual() {
		return situacaoAtual;
	}

	public void setSituacaoAtual(EstadoDeUmPedido situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}
	
}
