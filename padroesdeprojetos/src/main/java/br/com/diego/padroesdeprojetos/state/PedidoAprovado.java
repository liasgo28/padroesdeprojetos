package br.com.diego.padroesdeprojetos.state;

public class PedidoAprovado implements EstadoDeUmPedido{

	public void aplicaDescontoExtra(Pedido pedido) {
		pedido.setValorTotal(pedido.getValorTotal() - (pedido.getValorTotal() * 0.2));		
	}

	public void proximoEstado(Pedido pedido) {
		pedido.setSituacaoAtual(new PedidoFinalizado());
	}

}
