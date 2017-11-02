package br.com.diego.padroesdeprojetos.strategy;

public class ICMS extends Imposto{
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
		// TODO Auto-generated constructor stub
	}

	public ICMS() {
		super();		
	}
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
