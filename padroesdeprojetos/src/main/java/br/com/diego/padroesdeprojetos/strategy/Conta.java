package br.com.diego.padroesdeprojetos.strategy;

import java.util.Calendar;
import java.util.Date;

public class Conta {
	private double saldo;
	private String nome;
	private int numero;
	private int agencia;
	private Calendar dataAbertura;
	
	
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
	
	public void deposita(double valor) {
        this.saldo += valor;
      }
	public Conta(double saldo, String nome, int numero, int agencia) {
		super();
		this.saldo = saldo;
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
	
}
