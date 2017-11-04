package br.com.diego.padroesdeprojetos.state;

public class PedidoNoCarrinho implements EstadoDeUmPedido{

	public void aplicaDescontoExtra(Pedido pedido) {
		pedido.setValorTotal(pedido.getValorTotal() - (pedido.getValorTotal() * 0.1));
	}

	public void proximoEstado(Pedido pedido) {
		pedido.setSituacaoAtual(new PedidoRealizado());	
	}

}
