package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;

public interface IMatriculaService {
	
	Matricula create(MatriculaForm form);
	
	List<Matricula> getAll(String bairro);
}
