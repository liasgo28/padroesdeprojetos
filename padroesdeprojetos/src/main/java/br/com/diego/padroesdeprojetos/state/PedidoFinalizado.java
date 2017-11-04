package br.com.diego.padroesdeprojetos.state;

public class PedidoFinalizado implements EstadoDeUmPedido{

	public void aplicaDescontoExtra(Pedido pedido) {
		throw new RuntimeException("Pedidos finalizados não recebem desconto extra!");
	}
	
	public void proximoEstado(Pedido pedido) {
		throw new RuntimeException("Pedidos finalizados não tem proximo estado!");
	}

}
