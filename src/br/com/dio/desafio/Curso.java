package br.com.dio.desafio;

public class Curso extends Conteudo{
	//Atributos
	
	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}
	
	public Curso() {
		
	}
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
