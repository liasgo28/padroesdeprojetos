package br.com.diego.padroesdeprojetos.state;

public interface EstadoDeUmPedido {
	void aplicaDescontoExtra(Pedido pedido);
	void proximoEstado(Pedido pedido);
}
