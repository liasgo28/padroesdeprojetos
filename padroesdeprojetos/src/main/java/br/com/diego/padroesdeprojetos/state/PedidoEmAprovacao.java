package br.com.diego.padroesdeprojetos.state;

public class PedidoEmAprovacao implements EstadoDeUmPedido{

	public void aplicaDescontoExtra(Pedido pedido) {
		pedido.setValorTotal(pedido.getValorTotal() - (pedido.getValorTotal() * 0.05));
	}

	public void proximoEstado(Pedido pedido) {
		pedido.setSituacaoAtual(new PedidoAprovado());
	}

	

}
