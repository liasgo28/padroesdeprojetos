package br.com.diego.padroesdeprojetos.state;

public class TesteDeDescontosPedido {
	public static void main(String[] args) {
        Pedido reforma = new Pedido(500.0);

        reforma.aplicaDescontoExtra();
        
        System.out.println(reforma.getValorTotal());
      }
}
