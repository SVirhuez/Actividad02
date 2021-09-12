package com.medicamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicamento.entity.Medicamento;
import com.medicamento.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoRestController {
	
	@Autowired
	private MedicamentoService service;
	
	@GetMapping("/ListId/{paramId}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaPorId(@PathVariable("paramId")int id){
		List<Medicamento> lista = service.BuscarPorId(id);
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/ListNombre/{paramNombre}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaPorNombre(@PathVariable("paramNombre")String nombre){	
			List<Medicamento> lista = service.BuscarPorNombre(nombre);
			return ResponseEntity.ok(lista);
		
	}
	
	@GetMapping("/ListStock/{paramStock}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaPorStock(@PathVariable("paramStock")int stock){	
			List<Medicamento> lista = service.BuscarPorStock(stock);
			return ResponseEntity.ok(lista);
		
	}

}
