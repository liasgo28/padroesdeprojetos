package br.com.diego.padroesdeprojetos.strategy;

public class ISS extends Imposto{
	public ISS(Imposto outroImposto) {
		super(outroImposto);
		// TODO Auto-generated constructor stub
	}
	
	public ISS() {
		super();		
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}
}
