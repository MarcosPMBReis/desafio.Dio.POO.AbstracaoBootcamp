package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Mentoria() {
		super();
	}
	
	
	
}
