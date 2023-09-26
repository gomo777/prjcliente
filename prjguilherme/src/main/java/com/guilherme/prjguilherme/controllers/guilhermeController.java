package com.guilherme.prjguilherme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.prjguilherme.entities.guilherme;
import com.guilherme.prjguilherme.servicies.guilhermeService;

@RestController
@RequestMapping("/guilherme")
public class guilhermeController {
private final guilhermeService guilhermeService;
	
	@Autowired
	public guilhermeController(guilhermeService guilhermeService) {
		this.guilhermeService = guilhermeService ;
	}
	
	@PostMapping
	public guilherme createProduct(@RequestBody guilherme guilherme ) {
		//return produtoService.saveProduto(produto);
		return guilhermeService.Saveguilherme(guilherme);
	}
	@GetMapping("/{id}")
	public guilherme getguilherme(@PathVariable Long idcCliente) {
		return guilhermeService.getguilhermeByidcCliente(idcCliente);
	}
	
	@GetMapping
	public List<guilherme> getAllguilherme(){
		return guilhermeService.getAllguilherme();
	}
	@DeleteMapping("/{idcCliente}")
	public void deleteguilherme(@PathVariable Long idcCliente) {
		guilhermeService.deleteguilherme(idcCliente);
	}
	
}
