package br.com.diego.padroesdeprojetos.decorator;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public abstract class Filtro {

	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected Filtro outroFiltro;
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro() {
		
	}
	
	public List<Conta> proximo(List<Conta> contas){
		if (outroFiltro != null) {
			return outroFiltro.filtra(contas);
		}
		return new ArrayList<Conta>();
	}
}
