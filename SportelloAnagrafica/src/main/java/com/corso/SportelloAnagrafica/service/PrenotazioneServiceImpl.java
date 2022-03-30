package com.corso.SportelloAnagrafica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.corso.SportelloAnagrafica.model.Prenotazione;
import com.corso.SportelloAnagrafica.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService{

	@Autowired
	PrenotazioneRepository prenotazioneRepository;

	@Override
	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneRepository.findAll();
	}

	@Override
	public void addPrenotazione(Prenotazione prenotazione) {
		prenotazioneRepository.save(prenotazione);
		
	}

	@Override
	public String selectPrenotazioneByCognome(String cognome) {
		return prenotazioneRepository.selectIdPrenotazioneByCognome(cognome);
	}

	@Override
	public String selectCognomeByIdPrenotazione(Integer prenotazione) {
		
		return prenotazioneRepository.selectCognomeByIdPrenotazione(prenotazione);
	}

	@Override
	public String prenota(String cognome,String nome) {
		Prenotazione prenotazione=new Prenotazione();
		prenotazione.setCognome(cognome);
		prenotazione.setNome(nome);
		prenotazioneRepository.save(prenotazione);
		return prenotazioneRepository.selectIdPrenotazioneByCognome(cognome);
	}

	@Override
	public Long preontazioneSuccessivaId() {
		// TODO Auto-generated method stub
		return prenotazioneRepository.prenotazioneSuccessivaId();
	}

	@Override
	public Optional<Prenotazione> prenotazioneSuccessiva(Long id) {
		id =preontazioneSuccessivaId();
		
		return prenotazioneRepository.findById(id);
	}

	@Override
	public void rinuncia(Long id) {
		prenotazioneRepository.deleteById(id);
		
	}

	@Override
	public Long tempoAttesa(Long Id) {
		
		return prenotazioneRepository.tempoAttesa(Id);
	}

	
	
	
	
//	prenota, dato il cognome di una persona, inserisce una nuova prenotazione in coda presso lo sportello;
//	prenota restituisce il numero d&#39;ordine associato alla prenotazione;
	




}
