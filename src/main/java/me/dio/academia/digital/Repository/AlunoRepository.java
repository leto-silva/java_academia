package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.Aluno;
import java.time.LocalDate;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	List<Aluno> findBydataDeNascimento(LocalDate dataDeNascimento);

}
