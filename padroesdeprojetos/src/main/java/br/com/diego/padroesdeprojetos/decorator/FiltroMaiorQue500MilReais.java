package br.com.diego.padroesdeprojetos.decorator;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Conta;

public class FiltroMaiorQue500MilReais extends Filtro {

	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMaiorQue500MilReais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
          if(c.getSaldo() > 500000) {
        	  filtrada.add(c);
          }
        }

        filtrada.addAll(proximo(contas));
        return filtrada;
	}

}
