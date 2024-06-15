package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosConcluido = new LinkedHashSet<Conteudo>();;
	
	public void inscreverBootcamp (Bootcamp bootcamp){
		
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
		
	}
	
	
	public void progredir () {
		
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluido.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteudo");
		}
	}
	
	public double calcularTotalXP() {
		
		return this.conteudosConcluido
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXP())
				.sum();
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	
	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}
	
	public Set<Conteudo> getConteudosConcluido() {
		return conteudosConcluido;
	}
	
	public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
		this.conteudosConcluido = conteudosConcluido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluido, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluido, other.conteudosConcluido)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
}
