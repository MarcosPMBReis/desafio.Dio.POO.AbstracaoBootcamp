package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Backend JAVA");
		curso.setDescricao("Curso de backend com java");
		curso.setCargaHoraria(10);
		
		Curso curso02 = new Curso();
		curso02.setTitulo("Node JS");
		curso02.setDescricao("Curso de Node Js");
		curso02.setCargaHoraria(20);
		
		Mentoria mentoria01 = new Mentoria();
		mentoria01.setData(LocalDate.now());
		mentoria01.setDescricao("Mentoria de Java");
		mentoria01.setTitulo("Mentoria Java");
		
		
		System.out.println(curso);
		System.out.println(curso02);
		System.out.println(mentoria01);
		
	}
}
