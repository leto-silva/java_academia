package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;

public interface IAlunoService {
	
	public Aluno create(AlunoForm form);
	
	public Aluno get(Long id);
	
	public List<Aluno> getAll();
	
	//public Aluno update (Long id, AlunoUpdateForm formUpdate);
	
	public void delete(Long id);

	public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long aluno_id);
	

}
