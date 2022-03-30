package com.corso.SportelloAnagrafica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.corso.SportelloAnagrafica.model.Prenotazione;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long>{

	@Query(nativeQuery = true,value= "SELECT id from prenotazioni where cognome =?1 ")
	public String selectIdPrenotazioneByCognome(String cognome);
	
	@Query(nativeQuery = true,value= "SELECT cognome from prenotazioni where id =?1 ")
	public String selectCognomeByIdPrenotazione(Integer prenotazione);
	
	@Query(nativeQuery = true,value= "SELECT MAX(id)-1  FROM `prenotazioni` ")
	public Long prenotazioneSuccessivaId();
	
	@Query(nativeQuery = true,value= "select * from prenotazioni where id=?1 ")
	public Long prenotazioneSuccessiva(Long Id);
	
	@Query(nativeQuery = true,value= "DELETE FROM `prenotazioni` WHERE id=?1")
	public void rinuncia(Long Id);
	
	@Query(nativeQuery = true,value= "select count(*) from prenotazioni where id<?1")
	public Long tempoAttesa(Long Id);
	

}






