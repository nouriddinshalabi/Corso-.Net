package com.corso.SportelloAnagrafica.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.corso.SportelloAnagrafica.model.Prenotazione;
import com.corso.SportelloAnagrafica.service.PrenotazioneService;

@RestController
public class SportelloController {

	@Autowired
	PrenotazioneService prenotazioneService;
	
	@GetMapping("/prenotazioni")
	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneService.getAllPrenotazioni();
	}
	
	@PostMapping("/prenotazioni")
	public void addPrenotazione(@RequestBody Prenotazione prenotazione) {
		prenotazioneService.addPrenotazione(prenotazione);
	}
	
	@GetMapping("/findIdByCognome/{cognome}")
	public String selectPrenotazioneByCognome(@PathVariable String cognome){
		return prenotazioneService.selectPrenotazioneByCognome(cognome);
	}
	
	@GetMapping("/findCognomeByPrenotazione/{prenotazione}")
	public String selectPrenotazioneByCognome(@PathVariable Integer prenotazione){
		return prenotazioneService.selectCognomeByIdPrenotazione(prenotazione);
	}
	
	@GetMapping("/prenota/{cognome}/{nome}")
	public String prenota(@PathVariable String cognome,@PathVariable String nome) {
		return prenotazioneService.prenota(cognome,nome);
	}
	
	@GetMapping("/prenotazioneSuccessiva")
	public Optional<Prenotazione> getPrenotazioneSuccessiva(Long id) {
		return prenotazioneService.prenotazioneSuccessiva(id);
	}
	

	
	@RequestMapping(value="/rinuncia/{id}",method = RequestMethod.DELETE)
	public void rinuncia(@PathVariable Long id) {
		prenotazioneService.rinuncia(id);
	}
	
	@GetMapping("/tempoAttesa/{id}")
	public Long tempoAttesa(@PathVariable Long id) {
		return prenotazioneService.tempoAttesa(id);
	}


}


