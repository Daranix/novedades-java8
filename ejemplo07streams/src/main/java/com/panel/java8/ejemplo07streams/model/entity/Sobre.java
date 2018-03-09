package com.panel.java8.ejemplo07streams.model.entity;

public class Sobre {
	private int id;
	@Override
	public String toString() {
		return "Sobre [id=" + id + ", empresario=" + empresario + ", total=" + total + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Empresario getEmpresario() {
		return empresario;
	}
	public void setEmpresario(Empresario empresario) {
		this.empresario = empresario;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	private Empresario empresario;
	private Double total;
	public Sobre(int id, Empresario empresario, Double total) {
		super();
		this.id = id;
		this.empresario = empresario;
		this.total = total;
	}
	
}
