package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;
import java.time.LocalDate;

@Service
public class AlunoServiceImpl implements IAlunoService{
    
	@Autowired
	private AlunoRepository alunoRepository;
		
	
	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());		
		return alunoRepository.save(aluno);
	}
	

	@Override
	public Aluno get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {			
		//
		if (dataDeNascimento == null) {
		    return alunoRepository.findAll();
		} else {
			
			LocalDate dataNasc = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
			return alunoRepository.findBydataDeNascimento(dataNasc);
		}
	}

	
	/*
	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}
*/

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long aluno_id) {
		Aluno aluno = alunoRepository.getById(aluno_id);
		return aluno.getAvaliacoes();
	}

		

}
