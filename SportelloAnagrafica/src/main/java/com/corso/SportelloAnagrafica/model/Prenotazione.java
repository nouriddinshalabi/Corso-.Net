package com.corso.SportelloAnagrafica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prenotazioni")
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long numeroOrdinePrenotazione;
	
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	
	
	public Prenotazione()
	{
		
	}


	public Prenotazione(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}


	public Prenotazione(Long numeroOrdinePrenotazione, String nome, String cognome) {
		super();
		this.numeroOrdinePrenotazione = numeroOrdinePrenotazione;
		this.nome = nome;
		this.cognome = cognome;
	}


	public Long getNumeroOrdinePrenotazione() {
		return numeroOrdinePrenotazione;
	}


	public void setNumeroOrdinePrenotazione(Long numeroOrdinePrenotazione) {
		this.numeroOrdinePrenotazione = numeroOrdinePrenotazione;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	


	

	
	
	
	
	
}
