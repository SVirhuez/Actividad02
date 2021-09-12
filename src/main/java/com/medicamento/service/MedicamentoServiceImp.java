package com.medicamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicamento.entity.Medicamento;
import com.medicamento.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImp implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repository;
	
	
	@Override
	public List<Medicamento> BuscarPorId(int id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Medicamento> BuscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombreLike(nombre);
	}

	@Override
	public List<Medicamento> BuscarPorStock(int stock) {
		// TODO Auto-generated method stub
		return repository.findByStock(stock);
	}

}
