package com.guilherme.prjguilherme.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.prjguilherme.entities.guilherme;
import com.guilherme.prjguilherme.repository.GuilhermeRepository;
@Service
public class guilhermeService {
	private final GuilhermeRepository guilhermeRepository;
	
	@Autowired
	public guilhermeService(GuilhermeRepository guilhermeRepository ) {
		this.guilhermeRepository = guilhermeRepository;
	}
	
	public guilherme Saveguilherme(guilherme guilherme) {
		return guilhermeRepository.save(guilherme);
	}
	public List<guilherme> getAllguilherme(){
		return guilhermeRepository.findAll();
	}
	
	public guilherme getguilhermeByidcCliente(Long idcCliente) {
		return guilhermeRepository.findById(idcCliente).orElse(null);			
	}
	
	public void deleteguilherme(Long idcCliente) {
		guilhermeRepository.deleteById(idcCliente);
	}
	
	


}
