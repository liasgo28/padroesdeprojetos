package br.com.diego.padroesdeprojetos.strategy;

import java.util.Random;

public class InvestimentoArrojado implements InvestimentoImpl {

	private Random random;

    public InvestimentoArrojado() {
      this.random = new Random();
    }
    
	public double investir(Conta conta) {
		int chute = random.nextInt(10);
        if(chute >= 0 && chute <= 1) return conta.getSaldo() * 0.5;
        else if (chute >= 2 && chute <= 4) return conta.getSaldo() * 0.3;
        else return conta.getSaldo() * 0.006;		
	}

}
