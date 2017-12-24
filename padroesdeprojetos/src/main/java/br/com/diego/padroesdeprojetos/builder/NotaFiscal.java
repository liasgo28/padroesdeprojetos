package br.com.diego.padroesdeprojetos.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.diego.padroesdeprojetos.strategy.Item;

/**
 * @author User
 *
 */
public class NotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private Calendar data;
	private double valorBruto;
	private double impostos;
	private List<Item> listaItens = new ArrayList<Item>();
	private String observacoes;

		
	public NotaFiscal(String razaoSocial, String cnpj, Calendar data, double valorBruto, double impostos,
			List<Item> listaItens, String observacoes) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.data = data;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.listaItens = listaItens;
		this.observacoes = observacoes;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	public List<Item> getListaItens() {
		return listaItens;
	}
	public void setListaItens(List<Item> listaItens) {
		this.listaItens = listaItens;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public double getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	@Override
	public String toString() {
		return "NotaFiscal [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", data=" + data + ", valorBruto="
				+ valorBruto + ", impostos=" + impostos + ", listaItens=" + listaItens + ", observacoes=" + observacoes
				+ "]";
	}
	
	
	
}
