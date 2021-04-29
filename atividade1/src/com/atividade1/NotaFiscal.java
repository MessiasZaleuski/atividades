package com.atividade1;

import java.util.Date;

public class NotaFiscal {
	private double numero;
	private Date data;
	private int cnpjEmissor;
	private double documentoCliente;
	private String nomeCliente;
	private String listaProdutosNota;
	
	
	public NotaFiscal(double numero, Date data, int cnpjEmissor, double documentoCliente, String nomeCliente,
			String listaProdutosNota) {
		this.numero = numero;
		this.data = data;
		this.cnpjEmissor = cnpjEmissor;
		this.documentoCliente = documentoCliente;
		this.nomeCliente = nomeCliente;
		this.listaProdutosNota = listaProdutosNota;
		
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getCnpjEmissor() {
		return cnpjEmissor;
	}
	public void setCnpjEmissor(int cnpjEmissor) {
		this.cnpjEmissor = cnpjEmissor;
	}
	public double getDocumentoCliente() {
		return documentoCliente;
	}
	public void setDocumentoCliente(double documentoCliente) {
		this.documentoCliente = documentoCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getListaProdutosNota() {
		return listaProdutosNota;
	}
	public void setListaProdutosNota(String listaProdutosNota) {
		this.listaProdutosNota = listaProdutosNota;
	}

}
