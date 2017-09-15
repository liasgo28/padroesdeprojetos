package br.com.diego.padroesdeprojetos.strategy;

public class Conta {
	private double saldo;
	private String nome;
	private int numero;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Conta(double saldo, String nome, int numero) {
		super();
		this.saldo = saldo;
		this.nome = nome;
		this.numero = numero;
	}	
	
	public void deposita(double valor) {
        this.saldo += valor;
      }
	
}
