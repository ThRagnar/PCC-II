package etec.pccii.newproject.model;

import java.util.logging.Level;


public abstract class Pessoa {
	
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
