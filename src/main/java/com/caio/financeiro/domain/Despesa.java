package com.caio.financeiro.domain;

import java.util.Date;
import java.util.Objects;

public class Despesa {

	private Integer id;
	private String descricao;
	private Date primeiroPagamento;
	private Double precoUnico;
	private Integer qtdeParcelas;

	private Categoria categoria;

	public Despesa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Despesa(Integer id, String descricao, Date primeiroPagamento, Double precoUnico, Integer qtdeParcelas,
			Categoria categoria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.primeiroPagamento = primeiroPagamento;
		this.precoUnico = precoUnico;
		this.qtdeParcelas = qtdeParcelas;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getPrimeiroPagamento() {
		return primeiroPagamento;
	}

	public void setPrimeiroPagamento(Date primeiroPagamento) {
		this.primeiroPagamento = primeiroPagamento;
	}

	public Double getPrecoUnico() {
		return precoUnico;
	}

	public void setPrecoUnico(Double precoUnico) {
		this.precoUnico = precoUnico;
	}

	public Integer getQtdeParcelas() {
		return qtdeParcelas;
	}

	public void setQtdeParcelas(Integer qtdeParcelas) {
		this.qtdeParcelas = qtdeParcelas;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Despesa other = (Despesa) obj;
		return Objects.equals(id, other.id);
	}

}
