package br.com.diego.padroesdeprojetos.strategy;

public abstract class Imposto {
	protected final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract double calcula(Orcamento orcamento);

	public Imposto() {
		this.outroImposto = null;
	}

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0;
		}
		return outroImposto.calcula(orcamento);
	}
}
