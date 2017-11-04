package br.com.diego.padroesdeprojetos.state;

public class PedidoRealizado implements EstadoDeUmPedido{

	public void aplicaDescontoExtra(Pedido pedido) {
		pedido.setValorTotal(pedido.getValorTotal() - (pedido.getValorTotal() * 0.07));
	}

	public void proximoEstado(Pedido pedido) {
		pedido.setSituacaoAtual(new PedidoEmAprovacao());
	}

}
