package com.medicamento.service;

import java.util.List;


import com.medicamento.entity.Medicamento;

public interface MedicamentoService {

	public abstract List<Medicamento> BuscarPorId(int id);	
	public abstract List<Medicamento> BuscarPorNombre(String nombre);
	public abstract List<Medicamento> BuscarPorStock(int stock);
}
