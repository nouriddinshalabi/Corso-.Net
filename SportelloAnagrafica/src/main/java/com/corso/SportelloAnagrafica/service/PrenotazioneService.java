package com.corso.SportelloAnagrafica.service;

import java.util.List;
import java.util.Optional;

import com.corso.SportelloAnagrafica.model.Prenotazione;

public interface PrenotazioneService {

	
	public List<Prenotazione> getAllPrenotazioni();
	
	public void addPrenotazione(Prenotazione prenotazione);
	
	public String selectPrenotazioneByCognome(String cognome);
	
	public String selectCognomeByIdPrenotazione(Integer prenotazione);
	
	public String prenota(String cognome,String nome);
	
	public Long preontazioneSuccessivaId();
	
	public Optional<Prenotazione> prenotazioneSuccessiva(Long id);
	
	public void rinuncia(Long id);
	
	public Long tempoAttesa(Long Id);


	
	
}
