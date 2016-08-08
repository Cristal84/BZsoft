package com.bzsoft;

import java.util.Date;

public class Persona {
	public Persona(String nome, String cognome, Date birth){
		this.nome=nome;
		this.cognome=cognome;
		this.birthdate=birth;
	}
	
	public String toString(){
		return nome+" "+cognome+" "+birthdate;
	}
	
	private String nome;
	private String cognome;
	private Date birthdate;

}
