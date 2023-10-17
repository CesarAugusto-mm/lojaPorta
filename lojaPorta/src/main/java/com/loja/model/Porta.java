package com.loja.model;

public class Porta {	
	
	private String tipo;
	private String cor;
	private Integer tamanho;
	private boolean vendida;
	private boolean temvidro;
	public Porta() {
		super();
		
	}
	public Porta(String tipo, String cor, Integer tamanho, boolean vendida, boolean temvidro) {
		super();
		this.tipo = tipo;
		this.cor = cor;
		this.tamanho = tamanho;
		this.vendida = vendida;
		this.temvidro = temvidro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getTamanho() {
		return tamanho;
	}
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	public boolean isVendida() {
		return vendida;
	}
	public void setVendida(boolean vendida) {
		this.vendida = vendida;
	}
	public boolean isTemvidro() {
		return temvidro;
	}
	public void setTemvidro(boolean temvidro) {
		this.temvidro = temvidro;
	}
	
}
