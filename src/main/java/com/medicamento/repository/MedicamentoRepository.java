package com.medicamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicamento.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {


	public List<Medicamento> findById(int id);
	
	public List<Medicamento> findByNombreLike(String nombre);
	
	public List<Medicamento> findByStock(int stock);
	
}
